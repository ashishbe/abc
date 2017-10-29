import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Studentinfo implements Serializable
{
	String name;
	int rollno;
	
	public Studentinfo(String name , int roll ) {
		this.name = name;
		this.rollno = roll;
	}
}

public class Serializationdemo {

	public static void main(String arg[]) throws IOException, ClassNotFoundException
	{
		
		// Serialization process
		
//		Studentinfo std = new Studentinfo("ashish", 1);
//		FileOutputStream fos = new FileOutputStream("student.src");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(std);
//		oos.close();
//		fos.close();
		
		// Deserialization process
		
		FileInputStream fis = new FileInputStream("student.src");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Studentinfo std  = (Studentinfo)ois.readObject();
		System.out.println("name - "+std.name+" roll no - "+std.rollno);
		ois.close();
		fis.close();
	}
}
