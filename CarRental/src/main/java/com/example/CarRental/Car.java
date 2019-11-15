package com.example.CarRental;

public class Car {
	
	private String plateNumber;
	private String brand;
	private String beginDate;
	private String endDate;
	private int price;
	private int numberOfSeats;
	
	public Car() {
		super();
	}
	
	public Car(String plateNumber, String brand, int price, int numberOfSeats, String beginDate, String endDate) {
		super();
		this.plateNumber = plateNumber;
		this.brand = brand;
		this.price = price;
		this.numberOfSeats = numberOfSeats;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getnumberOfSeats() {
		return numberOfSeats;
	}
	
	public void setnumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	public String getbeginDate() {
		return beginDate;
	}
	
	public void setbeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	
	public String getendDate() {
		return endDate;
	}
	
	public void setendDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Car [plateNumber=" + plateNumber + ", brand=" + brand + ", price=" + price + ", number of seats=" + numberOfSeats +"]";
	}

}
