import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calendar a = Calendar.getInstance();//현재 날짜를 가져옴
        Calendar b = new GregorianCalendar();//
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(Calendar.YEAR);
        System.out.println(Calendar.MONTH);//month는 -1 되서 나옴.문자열 형식을 맞춰줘야함.
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_WEEK);
	}

}
