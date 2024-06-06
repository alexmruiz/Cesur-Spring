package entidades;


import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Alumnos")
public class Alumnos implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "alumno_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id=0;
	
	private String Nombre;
	
	private String Apellidos;
	
	private String Curso;
	
	private int NumeroAsignatuas=0;
	
	private int edad=0;

	/**
	 * 
	 */
	public Alumnos() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}

	public int getNumeroAsignatuas() {
		return NumeroAsignatuas;
	}

	public void setNumeroAsignatuas(int numeroAsignatuas) {
		NumeroAsignatuas = numeroAsignatuas;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	

}



