
public class studentInfo {

	// 학번
	String sno;
	// studentNo의 줄임말 = sno .
	// int는 앞자리가 0일수없기때문에 String으로 씀

	// 이름
	String studentName;
	// 학과
	String studentMajor;
	// 평점
	double score;
	
	

	// 제품 출력하는 메서드
	public void showstudentInfo() {
		System.out.println("학번 :"+sno);
		System.out.println("이름 :"+studentName);
		System.out.println("학과 :"+studentMajor);
		System.out.println("평점 :"+score);
		
	}
       //초기화
		public void init(String s,String n,String m, double g) {
			sno=s;
			studentName=n;
			studentMajor=m;
			score=g;
		}
		public void printStudentInfo() {
			System.out.println("학번 :"+sno);
			System.out.println("이름 :"+studentName);
			System.out.println("학번 :"+studentMajor);
			System.out.println("평점 :"+getGrade()+"("+score+")");
		}
		public String getGrade() {
			if (score == 4.5)
				return "A+";
			else if (score >= 4.0)
				return "A";
			else if (score >= 3.5)
				return "B+";
			else if (score >= 3.0)
				return "B";
			else if (score >= 2.5)
				return "C+";
			else if (score >= 2.0)
				return "C";
			else if (score >= 1.0)
				return "D";
			
			else
				return "F";
		
     			
		}
		
		}


