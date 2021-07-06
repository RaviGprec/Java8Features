import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.*;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> listOfStudents = new ArrayList<Student>();
        
		listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));
		         
		listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));
		         
		listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));
		         
		listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));
		         
		listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));
		         
		listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));
		         
		listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));
		         
		listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));
		         
		listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));
		         
		listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));
		
		//Predicate-Test
		//Get list of MathsStudents
		Predicate<Student> mathStudentsPredicate = (Student s) -> s.getSpecialization().equalsIgnoreCase("Mathematics");
		List<Student> allMathStudents = new ArrayList<Student>();
		for(Student s: listOfStudents) {
			if(mathStudentsPredicate.test(s)) {
				allMathStudents.add(s);
			}
		}
		allMathStudents.forEach(s -> System.out.println(s.name));
		
		//Same thing can done using stream.
		List<Student> mStudents = listOfStudents.stream().filter(s -> s.getSpecialization()=="Mathematics").collect(Collectors.toList());
		mStudents.forEach(s -> System.out.println(s.name));
		//Consumer -accept(T t)
		Consumer<Student> studentCosumer = (Student s) -> {
			System.out.println(s.getName()+":"+s.getPercentage());
			};
		//Students and their Percentages
		for(Student s: listOfStudents) {
			studentCosumer.accept(s);
		}
		//Supplier
		Supplier<Student> studSupplier = () -> new Student(1391, "Ravi", 99.9, "Computers");
		listOfStudents.add(studSupplier.get());
		System.out.println(listOfStudents);
		
	}

}
