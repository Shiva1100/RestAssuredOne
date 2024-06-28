package APITesting.APITesting;

public class DeleteClass {

	public static void main(String[] args) {
		String str = "MShiva37";
		String gender1 = str.substring(0,1);
		String nameAndAge = str.substring(1,str.length());
		String name = nameAndAge.split("\b")[0];
		System.out.println("gender "+name);

	}

}
