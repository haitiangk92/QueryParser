package com.stackroute.datamunger.query.parser;

/*
 * This class is used for storing name of field, condition and value for each conditions
 * Generate getter and setter for this class,
 * Also override toString method
 * */

public class Restriction {
	String name;
	String value;
	String condition;
	
	public Restriction() {
		name = null;
		value = null;
		condition = null;
	}
	
	// Write logic for constructor
	public Restriction(String name, String value, String condition) {
		this.name = name;
		this.value = value;
		this.condition = condition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public String toString() {
		return "Restriction [name = " + name + ", value = " + value + ", condition = " + condition + "]";
	}
	
	

}