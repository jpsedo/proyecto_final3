package projecto_final_Dev.projecto_final_Dev.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import projecto_final_Dev.projecto_final_Dev.dao.IClienteDao;
import projecto_final_Dev.projecto_final_Dev.entity.Cliente;

@Service
public class ClientService implements IClienteService {

	private final IClienteDao clienteDao;

	public ClientService(IClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}

	@Override
	public Iterable<Cliente> findAll() {
		return clienteDao.findAll();
	}

	@Override
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	public void deleteById(Integer id) {
		try {
			clienteDao.deleteById(id);
		} catch (Exception exc) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente con id: " + id + " no encontrado");
		}
	}

}
