package Job;

import java.util.Scanner;

public class JobMain {

	public static void main(String[] args) {
		JobSeeker[]arr = new JobSeeker[10];
		for (int i=0; i <arr.length;i++) {
		arr[i]= new JobSeeker("구직자"+i);
		arr[i].start();
	}
	Scanner sc = new Scanner(System.in);
	JobManager manager = new JobManager();
	while (Thread.activeCount()!= 1 ) {
		System.out.println("직업 정보 입력>");
		String str = sc.nextLine();
		manager.writeJobManager(str);
	}
	}

}
