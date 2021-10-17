package com.gsj.designpatterns.factorymethod;

import com.gsj.designpatterns.factorymethod.message.Message;
import com.gsj.designpatterns.factorymethod.message.JSONMessage;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
