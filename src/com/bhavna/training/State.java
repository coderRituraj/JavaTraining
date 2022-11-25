package com.bhavna.training;

public class State extends Country {
	private String stateName;

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	public State(String countryName, String state) {
		super(countryName);
		this.stateName=state;
	}

	@Override
	public String toString() {
		return "Address [country = "+super.getCountryName()+", state = " + stateName + "]";
	}

}
