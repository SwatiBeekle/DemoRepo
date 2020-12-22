import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Objectrepository {

	public static void main(String[] args) throws IOException {
Properties prop = new Properties();
FileInputStream file= new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\Selenium\\confeg.properties");
prop.load(file);
System.out.println(prop.getProperty("name"));

	}

}
