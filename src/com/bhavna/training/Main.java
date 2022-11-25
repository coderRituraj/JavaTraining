package com.bhavna.training;

public class Main {
	public static void main(String[] args) {
		
		ZipService2 zipObj=new ZipService2();
		zipObj.setAddress(new ZipCode("India", "Punjab", "Dera Bassi",140507));
		zipObj.setAddress(new ZipCode("India", "Haryanan", "Ambala",133003));
		zipObj.setAddress(new ZipCode("India", "Amritsar", "Punjab",143001));
		zipObj.setAddress(new ZipCode("India", "Andhra Pradesh", "Anantpur",515001));
		zipObj.setAddress(new ZipCode("India", "Rajasthan", "Bharatpur",321001));
		zipObj.setAddress(new ZipCode("India", "Punjab", "Chandigarh",160017));
		zipObj.setAddress(new ZipCode("India", "Maharashtra", "Nashik", 422001));
		zipObj.setAddress(new ZipCode("India", "Madhya Pradesh", "Gwalior",474001));
		zipObj.setAddress(new ZipCode("India", "Madhya Pradesh", "Indore",452001));
		zipObj.setAddress(new ZipCode("India", "Uttar Pradesh", "Meerut",250001));
		System.out.println(zipObj.getAddress(140507));
		System.out.println(zipObj.getAddress(1118080));
		zipObj.printAddress(121003);
	}


}
