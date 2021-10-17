package com.gsj.designpatterns.decorator;

//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message {

	private Message msg;
	
	public HtmlEncodedMessage(Message msg) {
		this.msg = msg;
	}
	
	@Override
	public String getContent() {
		return escapeHtml4(msg.getContent());
	}

	private String escapeHtml4(String content) {
		return "<html>"+content+"</html>";
	}


}
