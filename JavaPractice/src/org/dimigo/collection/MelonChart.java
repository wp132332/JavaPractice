package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/*
 *
 * <pre>
 * org.dimigo.collection
 *		|_ MelonChart
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 25.
 * </pre>
 * @User				: Msg
 * @author			: 조준희
 * @version			: 1.0
 */
public class MelonChart {

	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		System.out.println("--<< 멜론 차트 >>--");
		list.add(new Music("바람이나 좀 쐐", "개리"));
		list.add(new Music("보통연애", "박경"));
		list.add(new Music("취향저격", "iKON"));

		printList(list);
		// 2위곡 추가
		System.out.println("--<< 2위곡 추가 >>--");
		list.add(1, new Music("레옹", "이유갓지"));
		printList(list);
		System.out.println("--<< 3위곡 변경>>--");
		list.set(2, new Music("맙소사", "황태지"));
		// 3위곡 변경 - 맙소사 황태지
		printList(list);
		System.out.println("--<< 4위곡 삭제>>--");
		list.remove(list.size() - 1);
		printList(list);
		// 4위곡 삭제
	}

	public static void printList(List<Music> list) {
		for (Music value : list) {
			System.out.println((list.indexOf(value)+1) +"." +value);
		}
	}
}
