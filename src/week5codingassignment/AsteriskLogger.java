package week5codingassignment;

public class AsteriskLogger implements Logger {
	
	
	public void Log(String str) {
		System.out.println("***" + str + "***");
		
	}

	@Override
	public void Error(String str) {
		StringBuilder asteriskLog = new StringBuilder("************");
		for (int i = 0; i < str.length(); i ++) {
			asteriskLog.append("*");
		}
		System.out.println(asteriskLog);
		System.out.println("***ERROR:" + str + "***");
		System.out.println(asteriskLog);
		
	}

}
