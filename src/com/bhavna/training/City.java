package com.bhavna.training;

public class City extends State {
	private String cityName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public City(String countryName, String state, String cityName) {
		super(countryName, state);
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [Country = "+super.getCountryName()+", state = "+super.getStateName()+ ", cityName = " + cityName + "]";
	}
	

}
