package es.pruebas.hibernate.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.pruebas.beans.cars.Car;
import es.pruebas.hibernate.dao.ICarDAO;

@Repository
public class CarDAO implements ICarDAO, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	SessionFactory sessionFactory;

	/**
	 * <p>
	 * Inserta el <code>Car</code> que se pasa como parametro
	 * </p>
	 * @param coche <code>Car</code> que se tiene que insertar
	 */
	public final void addCar(final Car coche) {
		// 1.- Obtenemos la session
		final Session session = sessionFactory.getCurrentSession();
		// 2.- ejecutamos query pre-definida para guardar coche
		session.save(coche);
	}

	/**
	 * <p>
	 * Obtiene todos los <code>Car</code> de b.d.
	 * </p>
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public final List<Car> getAllCars() {
		List<Car> resList = null;
		// 1.- Obtenemos la session
		final Session session = sessionFactory.getCurrentSession();
		// 2.- Creamos la query
		final Query query = session.getNamedQuery("getAllCars");
		// 3.- Ejecutamos la query
		resList = query.list();
		return resList;
	}

}
