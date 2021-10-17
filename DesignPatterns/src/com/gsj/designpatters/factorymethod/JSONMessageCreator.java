package com.gsj.designpatters.factorymethod;

import com.gsj.designpatters.factorymethod.message.Message;
import com.gsj.designpatters.factorymethod.message.JSONMessage;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
