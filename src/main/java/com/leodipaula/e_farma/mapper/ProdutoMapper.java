package com.leodipaula.e_farma.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import com.leodipaula.e_farma.dto.ProdutoDTO;
import com.leodipaula.e_farma.model.Produto;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {
    void atualizarProdutoComDto(ProdutoDTO dto, @MappingTarget Produto produto);
}
