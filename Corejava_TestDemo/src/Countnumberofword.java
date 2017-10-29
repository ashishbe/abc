
import java.util.*;


public class Countnumberofword {

	public static void main(String arg[])
	{
		String str = "ashish ashish jain is is good good boy";
		
		ArrayList<String> al = new ArrayList<>();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String str1 = new String();
		
		for( int i = 0 ; i < str.length() ; i++ )
		{
			if(str.charAt(i) != ' ')
			str1 = str1 + str.charAt(i);
			if( str.charAt(i) == ' ' || (i + 1) == str.length() )
			{
				al.add(str1);
				str1 = new String();
			}
		}
		
		for( int i = 0 ; i < al.size() ; i++ )
		{
			String st3 = al.get(i);
			Set set = hm.keySet();
			boolean bb = hm.containsKey(al.get(i));
			if(hm.containsKey(al.get(i)))
			{
				int num = hm.get(al.get(i));
				num++;
				hm.put(al.get(i), num);
			}
			else
			{
				hm.put( al.get(i) , 1 );
			}
		}
		
		System.out.println(al);
		
		Iterator it = hm.keySet().iterator();
		int nCOunt = 0;
		while (it.hasNext()) {
			String type = (String) it.next();
			int times = hm.get(type);
			System.out.println(type+" "+times);
			nCOunt = nCOunt + times;
		}
		System.out.println("number of times = "+nCOunt);
	}
}
