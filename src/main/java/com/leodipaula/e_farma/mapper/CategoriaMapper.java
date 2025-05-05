package com.leodipaula.e_farma.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import com.leodipaula.e_farma.dto.CategoriaDTO;
import com.leodipaula.e_farma.model.Categoria;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {
    void atualizarCategoriaComDto(CategoriaDTO dto, @MappingTarget Categoria categoria);
}
