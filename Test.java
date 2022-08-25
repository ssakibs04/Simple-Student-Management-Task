package week5.exercises;

public class Test {
	public static void main(String[] arg)
	{
		ArrayDemo Object = new ArrayDemo();
		
		Object.arrOfAge();
		Object.arrOfName();
		Object.arrySum();
		Object.arrOfCgpa();
		
		Person per = new Person();
		
		per.setName("Sakib");
		per.setAge(20);
		per.setOccupation("Student");
		
		System.out.println("Name :" +per.getName());
		System.out.println("Age :" +per.getAge());
		System.out.println("Occupation :" +per.getOccupation());
	}

}