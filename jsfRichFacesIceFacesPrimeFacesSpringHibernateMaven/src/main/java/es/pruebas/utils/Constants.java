package es.pruebas.utils;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public abstract class Constants {

	@ManagedProperty(value="richfaces")
	public static final String RICH_STRING = "richfaces";
	@ManagedProperty(value="primefaces")
	public static final String PRIME_STRING = "primefaces";
	@ManagedProperty(value="icefaces")
	public static final String ICE_STRING = "icefaces";
	@ManagedProperty(value="allfaces")
	public static final String ALL_STRING = "allfaces";

	public static String getRichString() {
		return RICH_STRING;
	}

	public static String getPrimeString() {
		return PRIME_STRING;
	}

	public static String getIceString() {
		return ICE_STRING;
	}

	public static String getAllString() {
		return ALL_STRING;
	}
}
