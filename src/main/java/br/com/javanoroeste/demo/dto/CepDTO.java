package br.com.javanoroeste.demo.dto;

import lombok.Data;

@Data
public class CepDTO {

  private String cep;

  private String logradouro;

  private String uf;

  private String localidade;
  
}
