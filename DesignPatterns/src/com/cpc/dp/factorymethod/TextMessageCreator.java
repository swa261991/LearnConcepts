package com.cpc.dp.factorymethod;

import com.cpc.dp.factorymethod.message.Message;
import com.cpc.dp.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
