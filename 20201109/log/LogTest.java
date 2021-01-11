package log;

import java.util.Calendar;
import java.util.Random;

public class LogTest {

	public static void writeLog(LogData Log) {
    System.out.println(Log.toString());
	}

	public static void test(int num) {
		System.out.println(num);
		// 로그 출력
		String content = "test()use,parameter :" + num;
		writeLog(new LogData("run", Calendar.getInstance(), content));

	}

	public static void main(String[] args) throws InterruptedException {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			test(r.nextInt(100));
			Thread.sleep(2000);
		}
	}

}
