package org.dimigo.oop;

/*
 *
 * <pre>
 * org.dimigo.oop
 *		|_ SnackTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 19.
 * </pre>
 * @User				: MING
 * @author			: 조준희
 * @version			: 1.0
 */
public class SnackTest {
	public static void main(String[] args) {
		int result = 0;
		
		Snack[] SnackArr = new Snack[] { new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4) };
		
		for(Snack v : SnackArr){
				v.printSnack();
				result+=v.calcPrice();
		}
		
			System.out.println("총 구매 금액 : " + String.format("%,d",result)+"원");
	}
}
