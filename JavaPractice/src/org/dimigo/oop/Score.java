package org.dimigo.oop;

import java.util.Scanner;

/*
 *
 * <pre>
 * org.dimigo.oop
 *		|_ Score
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 13.
 * </pre>
 * @User				: MING
 * @author			: 조준희
 * @version			: 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor, math, eng, total;
		double average;

		Scanner scanner = new Scanner(System.in);

		System.out.println("국어 점수 입력 => ");
		kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		math = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		eng = scanner.nextInt();

		total = kor + math + eng;
		average = (double)total / (double)3;

		String score = new StringBuilder().append("< 점수 출력 >>\n")
				.append("국어 점수 : ").append(kor).append(" 점\n")
				.append("수학 점수 : ").append(math).append(" 점\n")
				.append("영어 점수 : ").append(eng).append(" 점\n").append("총점 : ")
				.append(total).append(" 점\n").append("평균 : ").append(String.format("%.1f",average))
				.append(" 점\n").toString();
		
		System.out.println(score);
		scanner.close();
	}
}
