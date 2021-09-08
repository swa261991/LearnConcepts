package com.cpc.dp.factorymethod;

import com.cpc.dp.factorymethod.message.Message;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

	public Message getMessage() {
		Message msg = createMessage();
		
		msg.addDefaultHeaders();
		msg.encrypt();
		
		return msg;
	}
	
	//Factory method
	protected abstract Message createMessage();
}
