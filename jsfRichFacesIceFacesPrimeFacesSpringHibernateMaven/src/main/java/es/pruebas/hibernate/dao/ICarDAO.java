package es.pruebas.hibernate.dao;

import java.util.List;

import es.pruebas.beans.cars.Car;

public interface ICarDAO {

	/**
	 * <p>
	 * Inserta el <code>Car</code> que se pasa como parametro
	 * </p>
	 * @param coche <code>Car</code> que se tiene que insertar
	 */
	public void addCar(Car coche);
	/**
	 * <p>
	 * Obtiene todos los <code>Car</code> de b.d.
	 * </p>
	 * @return
	 */
	public List<Car> getAllCars();

}
