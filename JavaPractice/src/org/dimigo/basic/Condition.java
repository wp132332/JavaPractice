package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String car = "고속버스";
		int pay = 0;
		int dst = 10;

		switch (car) {
		case "고속버스":
			pay = 850;
			while ((dst - 1) / 10 != 0) {
				pay += 300;
				dst /= 10;
			}
			break;
		case "경차":
			pay = 300;
			while (dst / 10 != 0) {
				pay += 200;
				dst /= 10;
			}
			break;
		default:
			pay = 600;
			while (dst / 10 != 0) {
				pay += 200;
				dst /= 10;
			}
		}

		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + dst + "km");
		System.out.println("차종 : " + car);
		System.out.println("통행료 : " + pay + "원");
	}
}
