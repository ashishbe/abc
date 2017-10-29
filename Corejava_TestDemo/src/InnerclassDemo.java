
class Student
{
	static String name ;
	static int age;
	
	static class PersonalDetail
	{
		public void show()
		{
			System.out.println(name+" "+age);
		}
	}
}


public class InnerclassDemo {

	
	public static void main(String arg[])
	{
		Student stu = new Student();
		stu.age = 25;
		stu.name = "ashish";
		
//		Student.PersonalDetail stuper = stu.new PersonalDetail();
		Student.PersonalDetail stuper = new Student.PersonalDetail();
		stuper.show();
	}
}
