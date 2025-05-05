package com.leodipaula.e_farma.dto;

import java.math.BigDecimal;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record ProdutoDTO(
        @NotBlank(message = "O nome do produto é obrigatório") @Size(min = 2, max = 100,
                message = "O tamanho mínimo é de 2 e máximo de 100 caracteres") String nome,

        @NotBlank(message = "A descrição é do produto é obrigatória!") @Size(min = 10, max = 244,
                message = "O tamanho mínimo é de 10 e máximo de 244 caracteres!") String descricao,

        @NotNull(message = "O preço do produto é obrigatório!") BigDecimal preco,
        Long categoriaId) {

}
