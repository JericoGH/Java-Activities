package pack;
class EmployeeParameter {
	String name, address;
	int age;
	char sex;
	
	EmployeeParameter (String na, int ag, char se, String add)
	{
		name = na;
		age = ag;
		sex = se;
		address = add;
		
		System.out.println("Employee Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Sex: " + sex);
		System.out.println("Address: " + address);
	}
}

public class Parametarized_Methods {

	public static void main(String[] args) {
		EmployeeParameter profile = new EmployeeParameter ("Jerico", 20, 'Y', "CSFP");
	}
}
