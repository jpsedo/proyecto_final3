package projecto_final_Dev.projecto_final_Dev.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import projecto_final_Dev.projecto_final_Dev.entity.Cliente;

@Repository
public class ClienteDao implements IClienteDao{
	
	private final IClienteRepository clienteRepository;
	
	public ClienteDao(IClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	
	}

	@Override
	@Transactional
	public Iterable<Cliente> findAll() {
		return clienteRepository.findAll();
	}
	
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Optional<Cliente> findById(Integer id) {
		return clienteRepository.findById(id);
	}
	
	public void deleteById(Integer id) {
		clienteRepository.deleteById(id);
	}

}
