package projecto_final_Dev.projecto_final_Dev.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projecto_final_Dev.projecto_final_Dev.entity.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Integer> {

}
