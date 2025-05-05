package com.leodipaula.e_farma.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.leodipaula.e_farma.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    public Optional<List<Produto>> findAllByNomeContainingIgnoreCase(String produto);

    public Optional<Produto> findByNomeIgnoreCase(String nome);
}
