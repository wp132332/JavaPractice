package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sa = 9, sb = 10;
		double sh = 5.8;

		int pa = 9;
		double ph = 5.4;
		double s1, s2;

		s1 = (sa + sb) * sh / 2;
		s2 = pa * ph;

		System.out.println("<<도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + s1);
		System.out.println("평행사변형 넓이 : " + s2);

		if (s1 > s2)
			System.out.println("사다리꼴이 평행사변형 보다 " + (s1 - s2) + " 더 큽니다.");
		else if (s1 < s2)
			System.out.println("평행사변형이 사다리꼴 보다 " + (s2 - s1) + "더 큽니다.");
		else
			System.out.println("평행사변형과 사다리꼴의 넓이가 같습니다.");
	}
}
