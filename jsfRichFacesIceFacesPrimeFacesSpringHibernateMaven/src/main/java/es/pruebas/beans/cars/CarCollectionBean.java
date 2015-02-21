package es.pruebas.beans.cars;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class CarCollectionBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @ManagedProperty(value="3")
    private int columns;
    @ManagedProperty(value="9")
    private int elements;
    @ManagedProperty(value="")
    private List<Car> cars;

    /*
    @PostConstruct
    private void inicializaCoches(){
		this.cars = new ArrayList<Car>(30);
		for(int i=1; i<=10; i++){
		    this.cars.add(new Car("FORD", "Mondeo"+i+1, 1000+i+1, true));
		}
		for(int i=1; i<=10; i++){
		    this.cars.add(new Car("RENAULT", "Megane"+i+1, 2000+i+1, true));
		}
		for(int i=1; i<=10; i++){
		    this.cars.add(new Car("OPEL", "Corsa"+i+1, 3000+i+1, true));
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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(final List<Car> cars) {
        this.cars = cars;
    }

}
