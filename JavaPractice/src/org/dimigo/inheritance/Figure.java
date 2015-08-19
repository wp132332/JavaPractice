package org.dimigo.inheritance;

/*
 *
 * <pre>
 * org.dimigo.inheritance
 *		|_ Figure
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 * @User				: MING
 * @author			: 조준희
 * @version			: 1.0
 */
public class Figure {
	private int centerX;
	private int centerY;

	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}	
	protected double calcArea(){
		return 0.0;
	}
	
	protected void printCenter() {
		System.out.println("중심좌표 : ("+ centerX+", " + centerY + ")");
	}
	protected void moveFigure(int x, int y) {
		centerX += x;
		centerY += y;
	}
}
