package week5codingassignment;

public class Application {

	public static void main(String[] args) {

		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.Log("hello");
		System.out.println("");
		asteriskLogger.Error("hello");
		System.out.println("");
		spacedLogger.Log("Hello");
		spacedLogger.Error("Hello");
		
		
	}

}
