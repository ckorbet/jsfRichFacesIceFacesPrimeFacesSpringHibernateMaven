package es.pruebas.spring.controllers;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import es.pruebas.beans.cars.Car;
import es.pruebas.services.ICarsServices;

@Controller(value="carConBean")
@Scope("session")
public class CarController implements Serializable{

	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory.getLogger(CarController.class);

	private String marca;
	private String modelo;
	private Long precio;
	private boolean disponible;

	@Autowired
	ICarsServices carsServices;

	/**
	 * <p>
	 * Crea una instancia por defecto de <code>CarController</code>
	 * </p>
	 */
	public CarController(){
		// Default constructor
	}

	/**
	 * <p>
	 * Crea uns instancia de <code>CarController</code>
	 * con el <code>ICarsServices</code> que se pasa como parametro.
	 * </p>
	 * @param carsServices <code>ICarsServices</code> que se tiene que asignar.
	 */
	public CarController(final ICarsServices carsServices){
		this.carsServices = carsServices;
	}

	/**
	 * <p>
	 * Inicializa b.d. metiendo 30 coches.
	 * <p>
	 */
	@PostConstruct
	private void inicializa(){
		this.inicialzaMercedes();
		LOGGER.info("Inicializados Mercedes");
		this.inicialzaBMW();
		LOGGER.info("Inicializados BMW");
		this.inicialzaAudi();
		LOGGER.info("Inicializados Audis");
	}

	/**
	 * <p>
	 * Inserta 10 Mercedes en b.d.
	 * </p>
	 */
	private final void inicialzaMercedes(){
		for(int i=1; i<=10; i++){
			final Car carToSave = new Car("Mercedes",
										  String.valueOf(i),
										  Long.valueOf("10000"),
										  true);
			carsServices.addCar(carToSave);
		}
	}

	/**
	 * <p>
	 * Inserta 10 BMW en b.d.
	 * </p>
	 */
	private final void inicialzaBMW(){
		for(int i=1; i<=10; i++){
			final Car carToSave = new Car("BMW",
										  String.valueOf(i),
										  Long.valueOf("10000"),
										  true);
			carsServices.addCar(carToSave);
		}
	}

	/**
	 * <p>
	 * Inserta 10 Audi en b.d.
	 * </p>
	 */
	private final void inicialzaAudi(){
		for(int i=1; i<=10; i++){
			final Car carToSave = new Car("Audi",
										  String.valueOf(i),
										  Long.valueOf("10000"),
										  true);
			carsServices.addCar(carToSave);
		}
	}

	/**
	 * <p>
	 * Obtiene <code>List< Car ></code> con todos los coches.
	 * </p>
	 * @return <code>List< Car ></code> con todos los coches.
	 */
	public final List<Car> getAllCars(){
		List<Car> resList = null;
		resList = carsServices.getAllCars();
		LOGGER.info("Obtenidos todos los coches");
		return resList;
	}

	/**
	 * <p>
	 * Inserta el nuevo <code>Car</code> que se pasa como parametro
	 * </p>
	 * @param newCar <code>Car</code> coche que se tiene que insertar
	 * @return <code>String</code> outcome de la accion
	 */
	public final String insertNewCar(){
		final Car newCar = new Car(this.marca,
								   this.modelo,
								   this.precio,
								   this.disponible);
		carsServices.addCar(newCar);
		this.resetCarData();
		LOGGER.info("Insertado nuevo coche");
		return null;
	}

	/**
	 * <p>
	 * Resetea los datos del coche insertado recientemente
	 * </p>
	 */
	private final void resetCarData(){
		this.marca = null;
		this.modelo = null;
		this.precio = null;
		this.disponible = false;
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

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(final Long precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(final boolean disponible) {
		this.disponible = disponible;
	}
}
