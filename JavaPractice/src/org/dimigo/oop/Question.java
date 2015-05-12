package org.dimigo.oop;

import java.util.Scanner;

/*
 *
 * <pre>
 * org.dimigo.oop
 *		|_ Question
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 * @User				: MING
 * @author			: 조준희
 * @version			: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("");
		System.out.println("2014~2015 NBA MVP 수상 선수는 ?");
		String answer = scanner.nextLine();

		if ("커리".equals(answer)) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다 !! ㅠ");
		}
		
		System.out.println("");
		System.out.println("농구 포지션에서 1번을 맡는 역할은 ?");
		answer = scanner.nextLine();
		
		if ("포인트가드".equalsIgnoreCase(answer)) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다 !! ㅠ");
		}
		System.out.println("");
		System.out.println("1번 정답 이전에 MVP를 수상한 선수는 ?");
		answer = scanner.nextLine();

		if ("데릭로즈".equals(answer)) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다 !! ㅠ");
		}
	}
}
