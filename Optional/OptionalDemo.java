import java.util.*;
import java.util.stream.Collectors;
public class OptionalDemo {
	public static Optional<Customer> getCustomerByEmail(String email) throws Exception {
		List<Customer> customers = CustomerDataBase.getAllCustomers();
		//return customers.stream().filter(c -> c.getEmailId() ==email).findAny().orElseThrow(()->new Exception("no customer present with this email id"));
		return customers.stream().filter(c -> c.getEmailId() ==email).findAny();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Customer c=new Customer(1,"Ravi","HYD",null);
		//String emailid = c.getEmailId().toUpperCase();//This is will give java.lang.NullPointerException 
		//System.out.println(emailid);
		//Below code to handle NullPointExceptin
		Optional<String> OptionalemailId = Optional.ofNullable(c.getEmailId());
		System.out.println(OptionalemailId.map(String::toUpperCase).orElseGet(()->"Default eamil"));
		System.out.println(getCustomerByEmail("pk"));
	}

} 
