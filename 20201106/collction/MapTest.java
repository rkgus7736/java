import java.util.HashMap;
import java.util.Iterator;
public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<String,Integer>map = new HashMap<String,Integer> ();
    //데이터 추가
    map.put("A",100);
    map.put("B",200);
    map.put("C",300);
    map.put("D",400);
    map.put("A",500);
    //키 값이 중복이 안되서 마지막에 등록된 키 값으로 저장됨
    
    //데이터 조회
    System.out.println(map.put("A",100));
    System.out.println(map.put("B",200));
    System.out.println(map.put("C",300));
    System.out.println(map.put("D",400));
   //맵에 있는 모든 데이터 조회
    Iterator<String> it = map.keySet().iterator();
    while (it.hasNext()) {
    	String key = it.next();
    	System.out.println(key + " "+map.get(key));
    }
    //데이터 개수
    System.out.println(map.size());
    //데이터가 있는지 확인
    System.out.println(map.containsKey("B")); //해당 키값이 있는지 확인
    System.out.println(map.containsValue(200));//해당 값이 있는지 확인
    map.remove("A");//키 값으로 삭제
    map.clear();//비우기
    map.isEmpty();//맵에 내용이 없는지 확인
    

	}

}
