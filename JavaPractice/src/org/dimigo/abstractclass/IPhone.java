package org.dimigo.abstractclass;

/*
 *
 * <pre>
 * org.dimigo.inheritance
 *		|_ IPhone
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 * @User				: MING
 * @author			: 조준희
 * @version			: 1.0
 */
public class IPhone extends SmartPhone {
	public IPhone() {
		this("아이폰","애플",700000);
	}

	public IPhone(String model, String company, int price) {
		super(model, company, price);
	}
	
	public void pay(){
		System.out.println("애플 페이로 결제합니다.");
	}
	public void useAirDrop(){
		System.out.println("AirDrop 기능을 사용합니다.");
	}
}
