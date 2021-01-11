package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListMain {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("홍길동", 20));
		list.add(new Person("고길동", 30));
		list.add(new Person("김길동", 23));
		list.add(new Person("최길동", 48));

		// 객체비교 삭제시 equals를 자동으로 호출.
		list.remove(new Person("고길동", 30));
		// 현재 저장된 값의 개수
		System.out.println(list.size());
		// 해당 값이 있는지?
		System.out.println(list.contains(new Person("최길동", 48)));
		// 리스트가 비어있느냐 (비어있으면 true 아니면 false)
		System.out.println(list.isEmpty());
		// 최길동이라는 사람이 있는 인덱스 값
		System.out.println(list.indexOf(new Person("최길동", 48)));
		// 결과가 -1 이면 해당 검사결과가 없음
		System.out.println(list.indexOf(new Person("최길동1", 48)));
		// 리스트에 있는 내용을 전부 비우는 부분
		list.clear();
		System.out.println(list.isEmpty());

		System.out.println("---------------");

		// 전체 조회-ver1 , for
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());

			System.out.println("---------------");
		}
		// 전체 조회 -ver2 , for-each
		for (Person p : list) {
			System.out.println(p.toString());

			System.out.println("---------------");
		}
		// 전체 조회 -ver3 , Iterator(꼭 외우기.추천)
		Iterator<Person> it = list.iterator();
		while (it.hasNext()) {
			// 다음 데이터가 있는지 물어보는것(있으면 true 없으면 false)
			System.out.println(it.next());
			// 다음 위치 이동한 다음에 그값을 리턴
			System.out.println("---------------");
		}

	}

}
