package java.GSONtest;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
	//System.out.println("Welcome to Asia");
	
	public static void main(String[] args) {
	Gson gson = new Gson();
	String JSON = "[{\"given\": [\"Derek\", \"A\"], \"family\": \"Ryan\"}]";
	Model model = gson.fromJson(JSON, Model.class);
	
	System.out.println("Welcome to Maharashtra/India");
	
	System.out.println(model);
	
	System.out.println("changes from baharat");
	System.out.println("changes2 from baharat");
	
	
	}
}
