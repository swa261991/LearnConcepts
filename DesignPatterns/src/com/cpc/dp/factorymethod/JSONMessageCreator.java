package com.cpc.dp.factorymethod;

import com.cpc.dp.factorymethod.message.Message;
import com.cpc.dp.factorymethod.message.JSONMessage;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
