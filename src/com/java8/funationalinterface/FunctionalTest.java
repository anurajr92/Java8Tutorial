package com.java8.funationalinterface;

public class FunctionalTest {
	
	public static void main(String[] args)
	{
		/** JAva 7
		Message msg1 = msgJava7();
		msg1.message(); **/
		
		/** JAva 8
		Message msg2 = msgJava8();
//		msg2.message();  **/
		
		/** Parametrized Message
		
		ParameterMsg pMsg = paraMeg();
		System.out.println(pMsg.message("Anu"));  **/
		
		/**  addition 
		additionInterface add = (a, b) ->(a+b);
		System.out.println(add.add(10, 20));
		**/
	}	
		


	private static Message msgJava8() {
		Message msg2 = ()-> {
			System.out.println("Hello World");
		};
		return msg2;
	}

	private static Message msgJava7() {
		
				Message msg1 = new Message() {
					
					@Override
					public void message() {
						System.out.println("Hello World");
						
					}
				};
				return msg1;
		
	}
	
	private static ParameterMsg paraMeg() {
		ParameterMsg pMsg = p ->{
			return "Welcome "+p;
		};
		return pMsg;
	}


}
