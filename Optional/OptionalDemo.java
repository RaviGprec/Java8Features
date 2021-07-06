import java.util.*;
import java.util.stream.Collectors;
public class OptionalDemo {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Customer c=new Customer(1,"Ravi","HYD",null);
		//String emailid = c.getEmailId().toUpperCase();//This is will give java.lang.NullPointerException 
		//System.out.println(emailid);
		//Below code to handle NullPointExceptin
		Optional<String> OptionalemailId = Optional.ofNullable(c.getEmailId());
		System.out.println(OptionalemailId.map(String::toUpperCase).orElseGet(()->"Default eamil"));
	}

} 
