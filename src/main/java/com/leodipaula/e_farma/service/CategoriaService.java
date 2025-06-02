package com.leodipaula.e_farma.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.leodipaula.e_farma.dto.CategoriaDTO;
import com.leodipaula.e_farma.mapper.CategoriaMapper;
import com.leodipaula.e_farma.model.Categoria;
import com.leodipaula.e_farma.repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private CategoriaMapper categoriaMapper;

    public Optional<Categoria> cadastrarCategoria(CategoriaDTO categoriaDTO) {
        if (categoriaRepository.findByTituloIgnoreCase(categoriaDTO.titulo()).isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Já existe categoria com esse título");
        }
        return Optional.of(categoriaRepository.save(new Categoria(categoriaDTO)));
    }

    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria buscarPorId(Long id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "Não existe categoria com esse id."));
    }

    public void deletarCategoria(Long id) {
        categoriaRepository.delete(buscarPorId(id));
    }

    public List<Categoria> buscarPorTitulo(String titulo) {
        return categoriaRepository.findAllByTituloContainingIgnoreCase(titulo)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "Não existe categoria com esse título."));
    }

    public Categoria atualizarCategoria(Long id, CategoriaDTO dto) {
        var categoria = buscarPorId(id);
        categoriaMapper.atualizarCategoriaComDto(dto, categoria);
        return categoriaRepository.save(categoria);
    }
}
