package com.leodipaula.e_farma.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CategoriaDTO(
        @NotBlank(message = "O título não pode estar vazio") @Size(min = 3,
                max = 100) String titulo,
        @NotBlank(message = "A descrição não pode estar vazia") @Size(min = 10,
                max = 200) String descricao) {

}
