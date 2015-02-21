package es.pruebas.services.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.pruebas.beans.people.Person;
import es.pruebas.hibernate.dao.impl.PersonDAO;
import es.pruebas.services.IPersonServices;

@Service
public class PersonServices implements IPersonServices, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	PersonDAO personDAO;

	/**
	 * <p>
	 * Inserta el <code>Person</code> que se pasa como parametro
	 * </p>
	 * @param coche <code>Person</code> que se tiene que insertar
	 */
	@Transactional
	public final void addPerson(final Person person) {
		personDAO.addPerson(person);

	}

	/**
	 * <p>
	 * Obtiene todos los <code>Person</code> de b.d.
	 * </p>
	 * @return
	 */
	@Transactional
	public List<Person> getAllPeople() {
		List<Person> resList = null;
		resList = personDAO.getAllpeople();
		return resList;
	}

}
