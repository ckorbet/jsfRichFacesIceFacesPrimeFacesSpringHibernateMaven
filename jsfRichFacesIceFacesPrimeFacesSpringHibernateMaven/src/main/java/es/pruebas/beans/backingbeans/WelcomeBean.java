package es.pruebas.beans.backingbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import es.pruebas.utils.Constants;

@ManagedBean
public class WelcomeBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value="../../resources/images/greenRightArrow.jpg")
	private String greenRightArrow;

	public final String richfacesForward(){
		return Constants.RICH_STRING;
	}

	public final String primefacesForward(){
		return Constants.PRIME_STRING;
	}

	public final String icefacesForward(){
		return Constants.ICE_STRING;
	}

	public final String allForward(){
		return Constants.ALL_STRING;
	}

	public String getGreenRightArrow() {
		return greenRightArrow;
	}

	public void setGreenRightArrow(final String greenRightArrow) {
		this.greenRightArrow = greenRightArrow;
	}

}
