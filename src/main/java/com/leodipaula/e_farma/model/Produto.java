package com.leodipaula.e_farma.model;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do produto é obrigatório")
    @Size(min = 2, max = 100, message = "O tamanho mínimo é de 2 e máximo de 100 caracteres")
    private String nome;

    @NotBlank(message = "A descrição é do produto é obrigatória!")
    @Size(min = 10, max = 244, message = "O tamanho mínimo é de 10 e máximo de 244 caracteres!")
    private String descricao;

    @NotNull(message = "O preço do produto é obrigatório!")
    private BigDecimal preco;

    @ManyToOne
    @JsonIgnoreProperties("produto")
    private Categoria categoria;
}
