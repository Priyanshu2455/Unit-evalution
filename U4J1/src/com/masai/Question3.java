package com.masai;

public  class Question3  {
	
	private int rmp;
	private int power;
	private String manufacturer;
	private Boolean hasTurbo;
	
	public void makeTurbo() {
		this.hasTurbo=true;
	}

	public int getRmp() {
		return rmp;
	}

	public void setRmp(int rmp) {
		this.rmp = rmp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Boolean getHasTurbo() {
		return hasTurbo;
	}

	public void setHasTurbo(Boolean hasTurbo) {
		this.hasTurbo = false;
	}

	

	public Question3(int rmp, int power, String manufacturer, Boolean hasTurbo) {
		super();
		this.rmp = rmp;
		this.power = power;
		this.manufacturer = manufacturer;
		this.hasTurbo = hasTurbo;
	}

	public Question3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}