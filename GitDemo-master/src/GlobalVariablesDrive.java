
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariablesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\91999\\eclipse-workspace\\Selenium_GlobalDataDrive\\GlobalData.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "Firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream("C:\\Users\\91999\\eclipse-workspace\\Selenium_GlobalDataDrive\\GlobalData.properties");
		prop.store(fos, null);
		
		
		
		System.out.println("git usage");
		System.out.println("just for git usage");
		System.out.println("just for git usage now in branch");
		System.out.println("branches are created in git when different want to use the same"
				+ "folder for different purposes");
		
		
	}

}
