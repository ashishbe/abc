
public class Test1 {

	
	static 
	{
		String[] arr = {"ashish" , "jain"};
		Test1.main(arr);
	}
	int i = 10;
	
	public void ashish()
	{
		i = 20;
	}
	public static void main(String arg[]) throws RuntimeException
	{
		System.out.println(arg.length);
		
        try 
        {
            badMethod();  
            System.out.print("A"); 
            throw new Exception();
        }  
        catch (Exception ex) 
        {
            System.out.print("B");  
        } 
        finally 
        {
            System.out.print("C"); 
        } 
        System.out.print("D"); 
	}
	
    public static void badMethod() 
    {
        throw new Error(); /* Line 22 */
    }
}
