package pt.com.gabriel.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pt.com.gabriel.exerciciossb.models.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping(path="/qualquer")
	public Cliente obterCliente() {
		return new Cliente(1, "Gabriel", "123.456.789.10");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.654.321.10");
	}
	
	@GetMapping()
	public Cliente obterClientePorId2(@RequestParam(name="id") int id) {
		return new Cliente(id, "Maria2", "987.654.321.10");
	}
}
