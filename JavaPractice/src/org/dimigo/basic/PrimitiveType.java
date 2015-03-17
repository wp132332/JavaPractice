package org.dimigo.basic;

public class PrimitiveType {

	public static void main(String[] args) {
		String name = "아이유";
		boolean isFemale = true;
		int age = 23;
		double height = 161.8d;
		float weight = 44.3f;
		char BloodType = 'A';
		
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : " + name);
		
		if (isFemale)
			System.out.println("성별 : 여자");
		else
			System.out.println("성별 : 남자");
		
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + " cm");
		System.out.println("체질량 : " + weight + " kg");
		System.out.println("혈액형 : " + BloodType + " 형");

	}

}
