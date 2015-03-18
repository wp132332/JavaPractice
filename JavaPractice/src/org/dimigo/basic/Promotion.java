package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long Promotion;
		long salary = 1700000;
		short worker = 3;
		int house = 1500;

		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", salary) + "원");
		System.out.println("점포 내 직원 수 : " + worker + "명");
		System.out.println("점포 수 : " + String.format("%,d", house) + "개");

		Promotion = salary * 12 * (long) worker * (long) house;

		System.out.println("연간 인건비 : " + String.format("%,d", Promotion) + "원");

	}
}
