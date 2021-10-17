package com.gsj.designpatters.factorymethod;

import com.gsj.designpatters.factorymethod.message.Message;
import com.gsj.designpatters.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
