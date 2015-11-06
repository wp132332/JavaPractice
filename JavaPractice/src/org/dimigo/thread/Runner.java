package org.dimigo.thread;

/*
 *
 * <pre>
 * org.dimigo.thread
 *		|_ Runner
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 6.
 * </pre>
 * @User				: Msg
 * @author			: 조준희
 * @version			: 1.0
 */
public class Runner extends Thread {
	private String name;

	public Runner() {

	}

	public Runner(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		int cnt = 110;
		System.out.println(name + " 출발");
		System.out.println("");
		while ((cnt -= 10) > 0) {
			System.out.println(name + " " + cnt + " 미터");
			System.out.println("");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name + " 골인");
	}
}
