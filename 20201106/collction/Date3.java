import java.util.Calendar;

public class Date3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar a = Calendar.getInstance();

		int year = a.get(Calendar.YEAR);
		int month = a.get(Calendar.MONTH) + 1;
		int date = a.get(Calendar.DATE);

		System.out.println(year + "년" + month + "월" + date + "일");
		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.print("이번년도에서 오늘이 몇 일째인가?:");
		System.out.println(Calendar.DAY_OF_YEAR);
		System.out.print("이번달은 며칠까지 있는가?:");
		System.out.println(a.getActualMaximum(Calendar.DATE));

	}

}
