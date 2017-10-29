
import java.util.ArrayList;
import java.util.Collections;

class student implements Comparable<student>
{
	int rollno;
	String name;
	
	public student( int  rollno , String name) {
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public int compareTo(student std1) {
		// TODO Auto-generated method stub
		return rollno - std1.rollno;
	}
}

public class ComparableInterface {

	public static void main(String arg[])
	{
		student st = new student(1, "ashish");
		student st1 = new student(3, "manoj");
		student st2 = new student(2, "ravi");
		student st3 = new student(4, "vikal");
		
		ArrayList<student> al = new ArrayList<student>();
		al.add(st);
		al.add(st1);
		al.add(st2);
		al.add(st3);
		
		Collections.sort(al);
		
		for( student std : al )
		{
			System.out.println(std.rollno+"  "+std.name);
		}

	}
	
}
