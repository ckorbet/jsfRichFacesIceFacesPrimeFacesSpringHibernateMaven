package es.pruebas.hibernate.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.pruebas.beans.people.Person;
import es.pruebas.hibernate.dao.IPersonDao;

@Repository
public class PersonDAO implements IPersonDao, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	SessionFactory sessionFactory;

	/**
	 * <p>
	 * Inserta el <code>Person</code> que se pasa como parametro
	 * </p>
	 * @param coche <code>Person</code> que se tiene que insertar
	 */
	public final void addPerson(final Person person) {
		final Session session = sessionFactory.getCurrentSession();
		session.save(person);
	}

	/**
	 * <p>
	 * Obtiene todos los <code>Person</code> de b.d.
	 * </p>
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public final List<Person> getAllpeople() {
		List<Person> resList = null;
		final Session session = sessionFactory.getCurrentSession();
		final Query query = session.getNamedQuery("getAllPeople");
		resList = query.list();
		return resList;
	}

}
