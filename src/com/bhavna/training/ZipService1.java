package com.bhavna.training;

import java.util.ArrayList;

public interface ZipService1 {
static ArrayList<ZipCode> address=new ArrayList<ZipCode>();
	
	public abstract void setAddress(ZipCode zipObj);
	
	public abstract ZipCode getAddress(int zipCode);
	
	public abstract void printAddress(int zipCode);

}
