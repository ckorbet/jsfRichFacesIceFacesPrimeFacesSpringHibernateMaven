package es.pruebas.beans.people;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@ManagedBean(name="personBean")
@Entity
@Table(name="person")
@NamedNativeQuery(name="getAllPeople",
				  query="select * from person",
				  resultClass=Person.class)
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="id_person", unique=true, nullable=false)
	private long idPerson;

	@ManagedProperty(value = "")
	@Column(name="nombre")
	private String nombre;

	@ManagedProperty(value = "")
	@Column(name="apellido1")
	private String apellido1;

	@ManagedProperty(value = "")
	@Column(name="apellido2")
	private String apellido2;

	/**
	 * <p>
	 * Crea una instancia por defecto de <code>Person</code>
	 * </p>
	 */
	public Person(){
		// Default constructor
	}

	/**
	 * <p>
	 * Crea una instancia de <code>Person</code> con
	 * todas sus propiedades
	 * </p>
	 * @param nombre <code>String</code> nombre que se tiene que asignar
	 * @param apellido1 <code>String</code> apellido1 que se tiene que asignar
	 * @param apellido2 <code>String</code> apellido2 que se tiene que asignar
	 */
	public Person(final String nombre,
				   final String apellido1,
				   final String apellido2){
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	public long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(final long idPerson) {
		this.idPerson = idPerson;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(final String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(final String apellido2) {
		this.apellido2 = apellido2;
	}


}
