package projecto_final_Dev.projecto_final_Dev.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import projecto_final_Dev.projecto_final_Dev.dto.ClienteRequest;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "genero")
	private String genero;

	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;

	@Column(name = "identificacion")
	private Integer identificacion;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "celular")
	private String celular;

	@Column(name = "direccion")
	private String direccion;

	public Cliente() {
	}
	
	public Cliente(ClienteRequest cliente) {
		this.id = cliente.getId();
		this.nombre = cliente.getNombre();
		this.apellido = cliente.getApellido();
		this.genero = cliente.getGenero();
		this.fechaNacimiento= cliente.getFechaNacimiento();
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
