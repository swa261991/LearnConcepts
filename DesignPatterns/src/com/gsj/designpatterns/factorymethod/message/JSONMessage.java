package com.gsj.designpatterns.factorymethod.message;

public class JSONMessage extends Message {

	@Override
	public String getContent() {
		return "{\"JSON]\":[]}";
	}

	@Override
	public String toString() {
		return "This is JSONMessage object toString()";
	}
}
