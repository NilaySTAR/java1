package commexample;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person=null;
		person=new Person("Sachin", 42);
		Person person2=new Person("Sachin", 42);
		String str=new String("java");
		String str1=new String("java");
		System.out.println(str.equals(str1));
		if(person.equals(person2))
		{
			System.out.println("Both Objects Are Equal");
		}
		else
		{
			System.out.println("Both Objects Are Not Equal");
		}
		

	}

}
