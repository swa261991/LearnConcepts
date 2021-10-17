package com.gsj.designpatterns.factorymethod.message;

public class TextMessage extends Message {
	
	@Override
	public String getContent() {
		return "Text";
	}

	@Override
	public String toString() {
		return "This is TextMessage object toString()";
	}
}
