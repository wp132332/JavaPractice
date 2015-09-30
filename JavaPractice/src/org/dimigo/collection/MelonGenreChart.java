package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 *
 * <pre>
 * org.dimigo.collection
 *		|_ MelonGenreChart
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 30.
 * </pre>
 * @User				: Msg
 * @author			: 조준희
 * @version			: 1.0
 */
public class MelonGenreChart {

	public static void main(String[] args) {
		// key : Genre : String
		// value : Music List
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> balad = new ArrayList<>();
		balad.add(new Music("내 첫사랑", "베리굿"));
		balad.add(new Music("또 다시 사랑", "임창정"));
		balad.add(new Music("부산에 가면", "박진영"));
		map.put("발라드", balad);
		List<Music> dance = new ArrayList<>();
		dance.add(new Music("커피","유재환,김예림"));
		dance.add(new Music("다 잘될거야","쿨"));
		map.put("댄스", dance);
		
		System.out.println("------ << 멜론 장르별 차트 >> ------");
		printMap(map);
		System.out.println("------ << 발라드 3위 곡 변경 >> ------");
		balad.set(2,new Music("지우고 지워도","차수경"));
		map.put("발라드", balad);
		printMap(map);
		System.out.println("------ << 발라드 1위 곡 삭제 >> ------");
		balad.remove(0);
		map.put("발라드",balad);
		printMap(map);
		System.out.println("------ << 전체 리스트 삭제 >> ------");
		map.clear();
	}

	public static void printMap(Map<String, List<Music>> map) {
		for (Entry<String, List<Music>> entry : map.entrySet()) {
			System.out.println("[" + entry.getKey() + "]");
			for (Music m : entry.getValue()) {
				System.out
						.println((entry.getValue().indexOf(m) + 1) + ". " + m);
			}
		}
		System.out.println();
	}
}
