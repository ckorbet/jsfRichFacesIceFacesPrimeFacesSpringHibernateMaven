package es.pruebas.hibernate.dao;

import java.util.List;

import es.pruebas.beans.people.Person;

public interface IPersonDao {

	/**
	 * <p>
	 * Inserta el <code>Person</code> que se pasa como parametro
	 * </p>
	 * @param coche <code>Person</code> que se tiene que insertar
	 */
	public void addPerson(Person person);
	/**
	 * <p>
	 * Obtiene todos los <code>Person</code> de b.d.
	 * </p>
	 * @return
	 */
	public List<Person> getAllpeople();

}
