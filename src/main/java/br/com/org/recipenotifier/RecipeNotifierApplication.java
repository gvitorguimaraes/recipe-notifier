package br.com.org.recipenotifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.org.recipenotifier.service.TestProducer;

@SpringBootApplication
public class RecipeNotifierApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeNotifierApplication.class, args);
	}

}


@RestController
class TestController
{
	@Autowired
	private TestProducer serviceProducer;
	
	@GetMapping("/teste/{name}")
	public String teste(@PathVariable("name") String name)
	{
		serviceProducer.sendMessage("Hello "+ name);
		return "OK";
	}
}