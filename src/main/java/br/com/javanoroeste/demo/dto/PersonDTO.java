package br.com.javanoroeste.demo.dto;

import java.time.LocalDate;
import java.time.Period;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PersonDTO {

  private Integer id;

  @NotEmpty
  @Size(min = 10)
  private String name;

  @NotNull  
  private LocalDate birthDate;

  public Integer getAge() {
    return Period.between(birthDate, LocalDate.now()).getYears();
  }
}
