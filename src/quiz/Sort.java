package quiz;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Employee> lEmployee = new ArrayList<Employee>();
		
		System.out.println("Enter the the number of records you want to create:");
		int iCount = Integer.parseInt(br.readLine());
		for(int i = 0; i < iCount; i++) {
			System.out.println("Provide details for record " + (i+1) );
			System.out.println("Enter first name:");
			String sFirstName = br.readLine();
			
			System.out.println("Enter last name:");
			String sLastName = br.readLine();
			
			System.out.println("Enter phone number:");
			String SPhoneNumber = br.readLine();
			
			System.out.println("Enter address:");
			String sAddress = br.readLine();
			
			lEmployee.add(new Employee(sFirstName, sLastName, SPhoneNumber, sAddress));
		}
		
		lEmployee.forEach(Employee::printDetails);
		List<Employee> lSortedEmployees = lEmployee.stream().sorted(Comparator.comparing(Employee::getFirstName)).collect(Collectors.toList());
		System.out.println("Sorted List!!");
		lSortedEmployees.forEach(Employee::printSortedFirstNames);
		

	}

}
