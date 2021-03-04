package projecto_final_Dev.projecto_final_Dev.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class ClienteRequest {

	@Positive
	private Integer id;

	@NotBlank
	@Size(min = 1, max = 50)
	private String nombre;

	@NotBlank
	@Size(min = 1, max = 50)
	private String apellido;

	@NotBlank
	@Size(min = 1, max = 20)
	private String genero;

	@NotNull
	private Date fechaNacimiento;

	@Positive
	@NotNull
	private Integer identificacion;

	@NotBlank
	@Size(min = 1, max = 20)
	private String telefono;

	@NotBlank
	@Size(min = 1, max = 20)
	private String celular;

	@NotBlank
	@Size(max = 500)
	private String direccion;

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
