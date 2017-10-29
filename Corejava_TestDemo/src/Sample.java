import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

class abccccc
{

	void  ajay(Object i)
	{
		System.out.println("ajay "+i);
	}
	
	static void ajay( String i)
	{
		System.out.println("shivakar");
	}
}

 class bbbc extends abccccc
{
	 
	   static void ajay(String i)
		{
			System.out.println("sub "+i);
		}
	 
  void ashish()
  {
	  System.out.println("ashish");
  }
}

public class Sample {

	
	public static void main(String ar[])
	{
		abccccc aa = new bbbc();
		aa.ajay(10);
		aa.ajay(10);
		aa.ajay(20);
		aa.ajay('a');
		
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(30);
		ts.add(40);
		ts.add(20);
		
		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			Integer type = (Integer) it.next();
			System.out.println(type);
		}
		
		int age = calculateAge(LocalDate.of(1961, 5, 17) , LocalDate.of(1969, 2, 17));
		System.out.println("age "+age);
		
		
		
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);
		 
		Period p = Period.between(birthday, today);
		 
		//Now access the values as below
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
		
	}
	
	public int getAge() {
	    long ageInMillis = new Date().getTime() - getBirthDate().getTime();
	    
	    Date age = new Date(ageInMillis);

	    return age.getDay();
	}
	
    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
	
}
