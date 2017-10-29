import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

class student1
{
	int rollno;
	String name;
	
	public student1( int rollno , String name ) {
		this.rollno = rollno;
		this.name = name;
	}
}

class studentchaincheck implements Comparator<student1>
{

	private ArrayList<Comparator<student1>> listComparators;
	
	public studentchaincheck(Comparator<student1> ... comparator) {
		listComparators = (ArrayList<Comparator<student1>>) Arrays.asList(comparator);
	}
	
	@Override
	public int compare(student1 o1, student1 o2) {
		
		for(Comparator<student1> comparator : listComparators)
		{
			int result = comparator.compare(o1, o2);
			if(result != 0 )
			{
				return result;
			}
		}
		
		return 0;
	}
	
}

class namecomparator implements Comparator<student1>
{

	@Override
	public int compare(student1 o1, student1 o2) {

		return o1.name.compareTo(o2.name);
	}
}


class rollnocomparator implements Comparator<student1>
{

	@Override
	public int compare(student1 o1, student1 o2) {
		
		return o1.rollno - o2.rollno;
	}
	

	
}

public class ComparatorInterface {

	public static void main(String arg[])
	{
		student1 std = new student1(1, "ashish");
		student1 std1 = new student1(2, "manoj");
		student1 std2 = new student1(5, "neeraj");
		student1 std3 = new student1(4, "vikal");
		student1 std4 = new student1(6, "deepak");
		
		ArrayList<student1> al = new ArrayList<>();
		al.add(std);
		al.add(std1);
		al.add(std2);
		al.add(std3);
		al.add(std4);
		
		Collections.sort(al , new studentchaincheck(new namecomparator() , new rollnocomparator()));
		
		for( student1 st : al )
		{
			System.out.println(st.rollno+"  "+st.name);
		}
	}
	
}
