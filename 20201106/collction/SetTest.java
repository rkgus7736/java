import java.util.HashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hset = new HashSet<Integer>();
		TreeSet<Integer> tset = new TreeSet<Integer>();
		//TreeSet :숫자 크기가 작은 순서대로 적용된다.똑같은 값은 적용X
	

		hset.add(10);hset.add(7);hset.add(9);hset.add(10);hset.add(13);
		hset.add(21);hset.add(37);hset.add(54);hset.add(40);hset.add(23);
		tset.add(10);tset.add(7);tset.add(9);tset.add(10);tset.add(13);
		tset.add(21);tset.add(37);tset.add(54);tset.add(40);tset.add(23);
		
		System.out.println(hset);
		System.out.println(tset);
	}

}
