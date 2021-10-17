package com.gsj.designpatters.flyweight;

//Interface implemented by Flyweights
public interface ErrorMessage {
	//Get error message
	String getText(String code);
}
