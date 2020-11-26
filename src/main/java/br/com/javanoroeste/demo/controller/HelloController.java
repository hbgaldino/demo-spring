package br.com.javanoroeste.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloController {

  public HelloController() {
    System.out.print("HelloControlleR()");
  }
  
  @GetMapping
  public String hello(@RequestParam String nome) {
    return "Hello " + nome;
  }
}
