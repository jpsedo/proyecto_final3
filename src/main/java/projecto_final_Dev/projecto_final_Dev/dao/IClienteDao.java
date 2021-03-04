package projecto_final_Dev.projecto_final_Dev.dao;

import java.util.Optional;

import projecto_final_Dev.projecto_final_Dev.entity.Cliente;

public interface IClienteDao {
	
	public Cliente save(Cliente cliente);
	
	public Iterable<Cliente> findAll();
	
	public Optional<Cliente> findById(Integer id);
	
	public void deleteById(Integer id);

}
