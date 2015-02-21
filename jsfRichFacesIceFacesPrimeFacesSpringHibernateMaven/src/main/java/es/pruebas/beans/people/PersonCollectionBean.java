package es.pruebas.beans.people;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class PersonCollectionBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value="3")
	private int columns;
	@ManagedProperty(value="9")
	private int elements;
	@ManagedProperty(value="")
	private List<Person> people;

	/*
	@PostConstruct
	private void inicializaCoches() {
		this.people = new ArrayList<Person>(30);
		for (int i = 1; i<=10; i++) {
			this.people.add(new Person("CARLOS-" + i, "TORRES-" + i, "GONZÁLEZ-" + i));
		}
		for (int i = 1; i<=10; i++) {
			this.people.add(new Person("PAKOTE-" + i, " EL DEL CULO-" + i, "GRANDOTE-" + i));
		}
		for (int i = 1; i<=10; i++) {
			this.people.add(new Person("JUANILLA-" + i, "QUE SE VA-" + i, "DE PUTILLAS-" + i));
		}
	}
	*/

	public int getColumns() {
		return columns;
	}

	public void setColumns(final int columns) {
		this.columns = columns;
	}

	public int getElements() {
		return elements;
	}

	public void setElements(final int elements) {
		this.elements = elements;
	}

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(final List<Person> people) {
		this.people = people;
	}

}
