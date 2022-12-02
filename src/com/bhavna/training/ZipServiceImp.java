package com.bhavna.training;

public class ZipServiceImp implements ZipService {

	public void setAddress(ZipCode zipObj) {
		address.add(zipObj);
	}
	
	public ZipCode getAddress(int zipCode) {
		for(int i=0;i<address.size();i++) {
			if(( address.get(i)).getZipCode()==zipCode) {
			return address.get(i);
				
				
			}
		}
			return new ZipCode(" "," "," ",-1);
	}
	
	public void printAddress(int zipCode) {
		for(int i=0;i<address.size();i++) {
			if(( address.get(i)).getZipCode()==zipCode) {
				System.out.println(address.get(i));
			}
		}
	}
}
