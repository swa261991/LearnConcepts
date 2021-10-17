package com.gsj.designpatterns.factorymethod;

import com.gsj.designpatterns.factorymethod.message.Message;
import com.gsj.designpatterns.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
