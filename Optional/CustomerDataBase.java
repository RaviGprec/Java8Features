import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDataBase {

	public static List<Customer> getAllCustomers(){
		return Stream.of(
				new Customer(1,"Ravi","AP","ravi@gamil.com"),
				new Customer(2,"Sahil","DEHLI","sahil@gmail.com"),
				new Customer(3,"Himanshu","PANJAB","hm@gamil.com"),
				new Customer(4,"Suman","Rajastan","suman@gamil.com"),
				new Customer(5,"Salma","BLR","salma@gamil.com")
				).collect(Collectors.toList());
	}
}
