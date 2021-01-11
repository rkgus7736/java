package Job;

public class JobInfo {
	private static JobInfo instance = new JobInfo();

	private String jobInfo;

	private JobInfo() {
		jobInfo = null;
	}

	public static JobInfo getInstance() {
		if (instance == null)
			instance = new JobInfo();
		return instance;// 싱글턴까지 완료
	}

	public synchronized void writeJob(String msg) {
		// 한번에 한명만 가져갈수있게 synchronized 해줘야함
		jobInfo = msg;// 자고 있는 스레드를 깨워줘야함
		notifyAll();
	}

	public synchronized String getJobInfo() throws InterruptedException {
		// job의 정보를 가져가는 부분, 한번에 한명만 가져갈수있게 synchronized 해줘야함
		String msg = null;
		if (jobInfo == null)
			wait();
		else {
			msg = jobInfo;
			jobInfo = null;// 누가 채가면 안되니까 null

		}
		return msg;
	}
}
