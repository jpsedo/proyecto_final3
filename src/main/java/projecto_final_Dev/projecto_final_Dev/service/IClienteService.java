package projecto_final_Dev.projecto_final_Dev.service;

import projecto_final_Dev.projecto_final_Dev.entity.Cliente;

public interface IClienteService {
	
	public Cliente save(Cliente cliente);
	
	public Iterable<Cliente> findAll();
	
	public void deleteById(Integer id);

}
