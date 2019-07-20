package week5codingassignment;

public class SpacedLogger implements Logger {

	//Could not figure out how to convert below method to string builder without errors
	@Override
	public void Log(String str) {
		String result = ""; 
		for (int i = 0; i < str.length(); i ++) {
			result += str.charAt(i) + " ";
		}
		System.out.println(result);
	}
	

	@Override
	public void Error(String str) {
		String result = ""; 
		for (int i = 0; i < str.length(); i ++) {
			result += str.charAt(i) + " ";
		}
		System.out.println("ERROR:" + result);
		
	}
	


}
