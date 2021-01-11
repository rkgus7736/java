package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "Hello World";
     System.out.println(System.identityHashCode(str));
     
     str = str.replace("Hello","JAVA");
     //hello 를 java로 바꾸겠다
     System.out.println(System.identityHashCode(str));
     System.out.println(str);
     System.out.println("------------------------");
     StringBuffer buffer = new StringBuffer("HelloWorld");
     System.out.println(buffer);
     buffer.replace(0,"Hello".length(),"JAVA");
     System.out.println(System.identityHashCode(buffer));         
     System.out.println(buffer);
	}

}
