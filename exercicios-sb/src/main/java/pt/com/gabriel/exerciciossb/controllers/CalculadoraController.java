package pt.com.gabriel.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("/somar/{a}/{b}")
	private String somar(@PathVariable int a, @PathVariable int b) {
		return Integer.toString(a + b);
	}
	
	@GetMapping("/subtrair")
	private String subtrair(@PathParam(value = "a") int a, @PathParam(value = "b") int b) {
		return Integer.toString(a - b);
	}
}
