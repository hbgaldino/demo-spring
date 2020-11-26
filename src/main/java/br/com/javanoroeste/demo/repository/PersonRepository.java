package br.com.javanoroeste.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.javanoroeste.demo.entity.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
  
}
