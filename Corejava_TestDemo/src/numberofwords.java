import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class numberofwords {

	public static void main(String srg[])
	{
		String str = "ashish is bad a boy";
		
		HashMap<Character, Integer> hm = new HashMap<>();
		ArrayList<Character> al = new ArrayList<>();
		
		for(int i = 0 ; i < str.length() ;i++ )
		{
			char ch = str.charAt(i);
			
			if( hm.containsKey(ch) )
			{
				int num = hm.get(ch);
				num++;
				hm.put(ch, num);
			}
			else
			{
				hm.put(ch, 1);
				al.add(ch);
			}
		}
		
		Set set = hm.keySet();
		
		Iterator<Character> it = set.iterator();
		while (it.hasNext()) {
			char ch = (char) it.next();
			int num = hm.get(ch);
			System.out.println(ch+" comes "+num+" times");
		}
		
	}
	
}
