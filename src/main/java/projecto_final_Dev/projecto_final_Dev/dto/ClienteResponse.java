package projecto_final_Dev.projecto_final_Dev.dto;

import java.util.Date;

import projecto_final_Dev.projecto_final_Dev.entity.Cliente;

public class ClienteResponse {

	private Integer id;

	private String nombre;

	private String apellido;

	private String genero;

	private Date fechaNacimiento;

	private Integer identificacion;

	private String telefono;

	private String celular;

	private String direccion;

	public ClienteResponse(Cliente cliente) {
		this.id = cliente.getId();
		this.nombre = cliente.getNombre();
		this.apellido = cliente.getApellido();
		this.genero = cliente.getGenero();
		this.fechaNacimiento = cliente.getFechaNacimiento();
		this.identificacion = cliente.getIdentificacion();
		this.telefono = cliente.getTelefono();
		this.celular = cliente.getCelular();
		this.direccion = cliente.getDireccion();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
