package com.leodipaula.e_farma.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.leodipaula.e_farma.dto.ProdutoDTO;
import com.leodipaula.e_farma.mapper.ProdutoMapper;
import com.leodipaula.e_farma.model.Categoria;
import com.leodipaula.e_farma.model.Produto;
import com.leodipaula.e_farma.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ProdutoMapper produtoMapper;

    @Autowired
    private CategoriaService categoriaService;

    public Optional<Produto> cadastrarProduto(Produto produto) {
        if (produtoRepository.findByNomeIgnoreCase(produto.getNome()).isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Já existe produto com esse nome.");
        }
        return Optional.of(produtoRepository.save(produto));
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "Não existe produto com esse id."));
    }

    public void deletarProduto(Long id) {
        produtoRepository.delete(buscarPorId(id));
    }

    public List<Produto> buscarPorNome(String nome) {
        return produtoRepository.findAllByNomeContainingIgnoreCase(nome)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "Não existe produto com esse nome."));
    }

    public Produto atualizarProduto(Long id, ProdutoDTO dto) {
        Produto produto = buscarPorId(id);
        produtoMapper.atualizarProdutoComDto(dto, produto);

        if (dto.categoriaId() != null) {
            Categoria categoria = categoriaService.buscarPorId(dto.categoriaId());
            produto.setCategoria(categoria);
        }

        return produtoRepository.save(produto);
    }

}
