package org.dimigo.inheritance;

/*
 *
 * <pre>
 * org.dimigo.inheritance
 *		|_ SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 * @User				: MING
 * @author			: 조준희
 * @version			: 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone[] phones = {new IPhone("Iphone6","애플",700000),new Galaxy("갤럭시 S6","삼성",650000)};
		
		for(SmartPhone sp : phones){
			System.out.println(sp.toString());
			sp.turnOn();
			sp.pay();
			sp.useSpecialFunction();
			sp.turnOff();
			System.out.println();
		}
	
	}
}
