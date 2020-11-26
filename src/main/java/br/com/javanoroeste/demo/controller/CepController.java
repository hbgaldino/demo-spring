package br.com.javanoroeste.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.javanoroeste.demo.dto.CepDTO;

@RestController
@RequestMapping("/v1/cep")
public class CepController {

  @Autowired
  private RestTemplate restTemplate;
  

  @GetMapping("/{cep}")
  public CepDTO fetchCep(@PathVariable String cep) {
    return restTemplate.exchange("https://viacep.com.br/ws/{cep}/json/", HttpMethod.GET, null, CepDTO.class, cep).getBody();
  }
}
