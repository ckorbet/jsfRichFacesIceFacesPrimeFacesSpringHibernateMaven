package es.pruebas.services.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.pruebas.beans.cars.Car;
import es.pruebas.hibernate.dao.impl.CarDAO;
import es.pruebas.services.ICarsServices;

@Service
public class CarsServices implements ICarsServices, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	CarDAO carDAO;

	/**
	 * <p>
	 * Inserta el <code>Car</code> que se pasa como parametro
	 * </p>
	 * @param coche <code>Car</code> que se tiene que insertar
	 */
	@Transactional
	public final void addCar(final Car coche) {
		carDAO.addCar(coche);
	}

	/**
	 * <p>
	 * Obtiene todos los <code>Car</code> de b.d.
	 * </p>
	 * @return
	 */
	@Transactional
	public final List<Car> getAllCars() {
		List<Car> resList = null;
		resList = carDAO.getAllCars();
		return resList;
	}

}
