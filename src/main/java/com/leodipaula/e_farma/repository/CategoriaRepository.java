package com.leodipaula.e_farma.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.leodipaula.e_farma.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    public Optional<List<Categoria>> findAllByTituloContainingIgnoreCase(String titulo);

    public Optional<Categoria> findByTituloIgnoreCase(String titulo);

}
