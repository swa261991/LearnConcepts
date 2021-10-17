package com.gsj.designpatterns.flyweight;

import com.gsj.designpatterns.flyweight.ErrorMessageFactory.ErrorType;

public class Client {

	public static void main(String[] args) {
		
		SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorType.GenericSystemError);
		System.out.println(msg1.getText("4056"));
		
		UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1202");
		System.out.println(msg2.getText(null));
	}

}

/*

A genetic error of type 4056 occured. Please refer to:
http://google.com/q=4056
You are BANNED. Sorry.
More information:
1202
You violated terms of use.
Banned For:48 Hours

* */