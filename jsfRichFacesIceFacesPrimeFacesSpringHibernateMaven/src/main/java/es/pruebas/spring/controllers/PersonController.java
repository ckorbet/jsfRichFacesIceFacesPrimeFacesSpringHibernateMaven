package es.pruebas.spring.controllers;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import es.pruebas.beans.people.Person;
import es.pruebas.services.IPersonServices;

public class PersonController implements Serializable{

	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory.getLogger(PersonController.class);

	private String nombre;
	private String apellido1;
	private String apellido2;

	@Autowired
	IPersonServices personServices;

	/**
	 * <p>
	 * Crea una instancia por defecto de <code>PersonController</code>
	 * </p>
	 */
	public PersonController(){
		// Default controller
	}

	/**
	 * <p>
	 * Crea uns instancia de <code>PersonController</code>
	 * con el <code>IPersonServices</code> que se pasa como parametro.
	 * </p>
	 * @param carsServices <code>ICarsServices</code> que se tiene que asignar.
	 */
	public PersonController(final IPersonServices personServices){
		this.personServices = personServices;
	}

	@PostConstruct
	private void inicializa(){
		for (int i = 1; i<=10; i++) {
			final Person person = new Person("CARLOS-" + i,
									   "TORRES-" + i,
									   "GONZÁLEZ-" + i);
			personServices.addPerson(person);
		}
		for (int i = 1; i<=10; i++) {
			final Person person = new Person("PAKOTE-" + i,
									   " EL DEL CULO-" + i,
									   "GRANDOTE-" + i);
			personServices.addPerson(person);
		}
		for (int i = 1; i<=10; i++) {
			final Person person = new Person("JUANILLA-" + i,
									   "QUE SE VA-" + i,
									   "DE PUTILLAS-" + i);
			personServices.addPerson(person);
		}
	}

	public final List<Person> getAllPeople(){
		List<Person> resList = null;
		resList = personServices.getAllPeople();
		LOGGER.info("Obtenidas todas las personas");
		return resList;
	}

	public final String insertNewPerson(){
		final Person newPerson = new Person(this.nombre,
									  this.apellido1,
									  this.apellido2);
		personServices.addPerson(newPerson);
		this.resetPersonData();
		LOGGER.info("Insertada nueva persona");;
		return null;
	}

	private void resetPersonData() {
		this.nombre = null;
		this.apellido1 = null;
		this.apellido2 = null;
	}

}
