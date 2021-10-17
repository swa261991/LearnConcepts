package com.gsj.designpatterns.facade;

import java.util.stream.Stream;

public class Client {

	public static void main(String[] args) {
		/*Order order = new Order("101", 99.99);
		EmailFacade facade = new EmailFacade();
		
		boolean result = facade.sendOrderEmail(order);
		
		System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));*/
		String[] names = COLUMNS.names();
		for (String name : names) {
			System.out.println(name+" ");
		}

	}

//	private static boolean sendOrderEmailWithoutFacade(Order order) {
//		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
//		Stationary stationary = StationaryFactory.createStationary();
//		Email email = Email.getBuilder()
//					  .withTemplate(template)
//					  .withStationary(stationary)
//					  .forObject(order)
//					  .build();
//		Mailer mailer = Mailer.getMailer();
//		return mailer.send(email);
//	}

	enum MySingltonObj {
		INSTANCE;
		int value;
		public void getTitle() {
			System.out.println("Fuck !!!");
		}
	};

}

enum COLUMNS {
	UUID,
	PARENT_ID,
	ER,
	VERSION;

	public static String [] names() {
		//return Stream.of(COLUMNS.values()).map(COLUMNS::name).toArray(String[]::new);
		Stream<COLUMNS> values = Stream.of(COLUMNS.values());
		Stream<String> stringStream = values.map(COLUMNS::name);
		String[] strings = stringStream.toArray(String[]::new);
		return null;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
