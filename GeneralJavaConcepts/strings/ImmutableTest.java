package strings;

public class ImmutableTest {

	public static void main(String[] args) {
		String name = "Ravi";
		System.out.println(name.concat("Kumar"));//RaviKumar
		System.out.println(name);//Out put will "Ravi"
		//String is made immutable for some security reasons
		//But we have two classes StringBuffer and StringBuilder for mutability feature
		StringBuffer sb= new StringBuffer("Ravi");
		sb.append("Kumar");
		//StringBuffer is mutable and is thread safe (only one thread can access it at a time
		System.out.println(sb);//RaviKumar
		StringBuilder sbd = new StringBuilder("Ravi");
		sbd.append("Kumar");
		System.out.println(sbd);//RaviKumar
	}

}
