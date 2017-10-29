import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCvs_File {

	public static void main(String arg[]) throws IOException
	{
		String csvFile = "C:/Users/Ashish/Desktop/SampleCSVFile_2kb.csv";
        String line = "";
        String cvsSplitBy = ",";
        
		try {
			BufferedReader br = new BufferedReader(new FileReader(csvFile));
			
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

            }
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
