package org.dimigo.inheritance;

/*
 *
 * <pre>
 * org.dimigo.inheritance
 *		|_ Galaxy
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 * @User				: MING
 * @author			: 조준희
 * @version			: 1.0
 */
public class Galaxy extends SmartPhone {

	public Galaxy() {
		this("갤럭시 S6","삼성",650000);
	}

	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}
	public void pay(){
		System.out.println("삼성 페이로 결제합니다.");
	}
	public void useWirelessCharging(){
		System.out.println("무선 충전 기능을 이용합니다.");
	}
}
