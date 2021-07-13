package strings;

public class StringNoOfObjTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("ravi");//Two objcts gets created. s1 obj i heap memory and String literal "ravi" obj in String Constant Pool Area
		String s2="ravi";//Here s2 is just reference will points to SCP area. 
		System.out.println(s1.hashCode()==s2.hashCode());
		//So total objects created here are 2 ONLY
	}

}
