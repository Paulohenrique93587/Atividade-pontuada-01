package com.senai.At.pontuada24.model;

import jakarta.persistence.Entity;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Entity
public enum Endereco {
    private Long id;
    private String logaradouro;
    private String numero;
    private String complemento;
    private String cidade;

}





