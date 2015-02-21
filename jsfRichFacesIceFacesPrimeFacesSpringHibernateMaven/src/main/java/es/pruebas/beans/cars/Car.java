package es.pruebas.beans.cars;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@ManagedBean(name="carBean")
@Entity
@Table(name="car")
@NamedNativeQuery(name="getAllCars",
				  query="select * from car",
				  resultClass=Car.class)
public class Car implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="id_car", unique=true, nullable=false)
	private long idCar;

	@ManagedProperty(value = "")
	@Column(name="marca")
	private String marca;

	@ManagedProperty(value = "")
	@Column(name="modelo")
	private String modelo;

	@ManagedProperty(value = "")
	@Column(name="precio")
	private long precio;

	@ManagedProperty(value = "")
	@Column(name="disponible")
	private boolean disponible;

	/**
	 * Crea una instancia por defecto de Car
	 */
	public Car() {
		// Default constructor
	}

	/**
	 * Crea una instancia de Car con todas sus propiedades
	 *
	 * @param marca
	 * @param modelo
	 * @param precio
	 * @param disponible
	 */
	public Car(final String marca, final String modelo, final long precio,
			final boolean disponible) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.disponible = disponible;
	}

	public long getIdCar() {
		return idCar;
	}

	public void setIdCar(final long idCar) {
		this.idCar = idCar;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(final String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(final String modelo) {
		this.modelo = modelo;
	}

	public long getPrecio() {
		return precio;
	}

	public void setPrecio(final long precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(final boolean disponible) {
		this.disponible = disponible;
	}

}
