package br.com.javanoroeste.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.javanoroeste.demo.dto.PersonDTO;
import br.com.javanoroeste.demo.service.PersonService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1/person")
@Slf4j
public class PersonController {

  @Autowired
  private PersonService personService;
  
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void create(@Valid @RequestBody final PersonDTO personDTO) {
    log.info("Request: {}", personDTO);
    personService.create(personDTO);
  }
}
