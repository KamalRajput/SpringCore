package com.Kamal.Spring.SpringCoreProperties;

import java.util.Properties;

public class CountriesandLanguages {

	
	private Properties countryAndLangs;

	public Properties getCountryAndLangs() {
		return countryAndLangs;
	}

	public void setCountryAndLangs(Properties countryAndLangs) {
		this.countryAndLangs = countryAndLangs;
	}
	
	
	@Override
	public String toString() {
	
		return "CountriesAndLanguages[countryAndLanguages="+countryAndLangs+"]";
	}
}
