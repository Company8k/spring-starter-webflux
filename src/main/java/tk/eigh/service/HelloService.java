package tk.eigh.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;


@RestController
public class HelloService {
  
  @GetMapping("/")
  public Flux<String> hello(){
    return Flux.just("Hello flux");
  }
}
