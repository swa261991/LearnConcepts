package com.gsj.designpatterns.decorator;

public class Client {

	public static void main(String[] args) {
		Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println("m hashcode + "+m.hashCode());
		System.out.println(m.getContent());

		//Wrap message in decorator
		m = new HtmlEncodedMessage(m);
		System.out.println(m.getContent());

		//Wrap decorator in another decorator
		m = new Base64EncodedMessage(m);
		System.out.println(m.getContent());
		System.out.println("m hashcode + "+m.hashCode());
	}
}
