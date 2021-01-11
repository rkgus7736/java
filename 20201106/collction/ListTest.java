import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List 데이터 추가된 순서가 보장 데이터 중복허용 ArrayList:조회용 (가장 많이 쓰게 될것) LinkedList: 추가,삭제
		 * Vector: 조회용, ArrayList 와 다른건 동기화 기능
		 * 
		 */

		ArrayList<String> list = new ArrayList<String>();
		// 추가
		list.add("A");
		list.add("C");
		list.add("B");
		// 삭제
		list.remove(0);
		list.remove("C");
		// 조회
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		for (String str : list)
			System.out.println(str);
		// String은 자주 쓰지 않지만 int 와 Iterator는 set에서는 동일하게 쓰기 때문에 외워야 함.

		Iterator<String> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
