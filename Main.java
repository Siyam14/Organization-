package HW;

public class Main {

			public static void main(String[] args) {
	        Employee emp = new Employee(1, "Shadman ", 55000);
	        Manager mgr = new Manager(2, "Siyam", 800000, "IT");
	        Developer dev = new Developer(3, "Afifa", 90000, "Java");

	        emp.setSalary(55000);
	        mgr.setDeptName("HR");
	        dev.setProgrammingLanguage("C");

	        System.out.println("Employee Details:");
	        emp.displayDetails();
	        System.out.println("\nManager Details:");
	        mgr.displayDetails();
	        System.out.println("\nDeveloper Details:");
	        dev.displayDetails();
	    }


}
