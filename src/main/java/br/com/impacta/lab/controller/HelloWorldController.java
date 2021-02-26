package br.com.impacta.lab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividades")
public class HelloWorldController {

	@GetMapping("hello")
	public ResponseEntity<?> helloWorld(@RequestParam(name="nome", required=false) String nome) {
		//a variável nome, contém o valor passado no browser na sua chamada
		//Exemplo http://localhost:8080/atividades/hello?nome=felipe
		//Considerando o exemplo acima a variável nome virá preenchida com o texto "felipe"
		
		//Considerando a dica acima, implemente seu código para que o programa retorne a 
		//palavra Hello world concatenada com o nome.
		//Exmeplo de resposta: Hello world felipe !
		
    String texto = "Hello world ";

    texto = texto + nome + " !";

    String texto1 = "Azul";

    String texto3 = "Azul";

    String texto5 = new String("Azul");

    boolean comparacao = texto1.equals(texto5);
		
		return ResponseEntity.ok(texto);
	}
	
}
