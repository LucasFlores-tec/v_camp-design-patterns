package br.com.virtualoutletstore.products;

public class SsdCard {

	private String brand;
	
	private int gigabytes;

	public SsdCard(String brand, int gigabytes) {
		this.brand = brand;
		this.gigabytes = gigabytes;
	}

	public String getBrand() {
		return brand;
	}

	public int getGigabytes() {
		return gigabytes;
	}
	
}
