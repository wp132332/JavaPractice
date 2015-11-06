package org.dimigo.thread;

/*
 *
 * <pre>
 * org.dimigo.thread
 *		|_ Race
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 6.
 * </pre>
 * @User				: Msg
 * @author			: 조준희
 * @version			: 1.0
 */
public class Race {
	public static void main(String[] args) {
		System.out.println("main thread start");
		Thread a = new Runner("홍길동");
		Thread b = new Runner("홍길순");
		a.start();
		b.start();
		System.out.println("main thread end");
	}
}
