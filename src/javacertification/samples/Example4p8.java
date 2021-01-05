package javacertification.samples;

import java.util.Properties;

public class Example4p8 {
	
	public static void main(String[] args) {
		Properties prop = System.getProperties();
		prop.setProperty("appName", "santoshakula");
		for(String pro: args) {
			
			String value = prop.getProperty(pro);
			System.out.printf("%s=%s%n",pro,value);
			
		}
	}

}
