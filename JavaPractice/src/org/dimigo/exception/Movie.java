package org.dimigo.exception;

/*
 *
 * <pre>
 * org.dimigo.exception
 *		|_ Movie
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 * @User				: Msg
 * @author			: 조준희
 * @version			: 1.0
 */
public class Movie {
	private String title;
	private int limitAge;
	
	/**
	 * 
	 */
	public Movie(String title,int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
		// TODO Auto-generated constructor stub
	}
	public String getTitle(){
		return title;
	}
	
	public int getLimitAge(){
		return limitAge;
	}
}
