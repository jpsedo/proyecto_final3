package projecto_final_Dev.projecto_final_Dev.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projecto_final_Dev.projecto_final_Dev.dto.ClienteRequest;
import projecto_final_Dev.projecto_final_Dev.dto.ClienteResponse;
import projecto_final_Dev.projecto_final_Dev.entity.Cliente;
import projecto_final_Dev.projecto_final_Dev.service.IClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	private final IClienteService clienteService;

	public ClienteController(IClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping
	public List<ClienteResponse> get() {
		List<ClienteResponse> clientes = new ArrayList<ClienteResponse>();
		clienteService.findAll().forEach(cliente -> {
			clientes.add(new ClienteResponse(cliente));
		});
		return clientes;
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Integer id) {
		clienteService.deleteById(id);
		
	}

	@PostMapping()
	public ClienteResponse save(@Valid @RequestBody ClienteRequest cliente) {
		Cliente clienteSaved =clienteService.save(new Cliente(cliente)); 
		return new ClienteResponse(clienteSaved);
	}
}
