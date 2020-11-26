package br.com.javanoroeste.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.javanoroeste.demo.dto.PersonDTO;
import br.com.javanoroeste.demo.entity.Person;
import br.com.javanoroeste.demo.repository.PersonRepository;

@Service
public class PersonService {

  @Autowired
  private PersonRepository personRepository;

  public PersonDTO create(PersonDTO personDTO) {

    Person person = Person.builder()
                            .id(personDTO.getId())
                            .name(personDTO.getName())
                            .birthDate(personDTO.getBirthDate())
                            .build();

    Person personPersisted = personRepository.save(person);


    return null;
  }
  
}
