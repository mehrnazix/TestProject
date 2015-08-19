import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		int year;
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				String input = scanner.nextLine();
				year = getYear(input);
				System.out.println(year);
				break;
				
			}
//			catch(NullPointerException e) {
//				System.out.println(e.getMessage());
//			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("reyhane");
		
	}
	
	public static boolean checkDateMatch (String string) {
		if (string.matches("\\d{4}/\\d{2}/\\d{2}")) {
			return true;
		}
		return false;
	}
	
	public static int getYear(String date) throws Exception {
		if (date.equals(null) || date.isEmpty()) {
			throw new NullPointerException("date can not be empty");
		}
		
		if (date.length() < 4) {
			throw new MyException("date length can not be less than 4");
		}
		
		if (!checkDateMatch(date)) {
			throw new Exception("wrong format!");
		}
		String year = date.substring(0, 4);
		int convertedYear = Integer.parseInt(year);
		return convertedYear;
	}

}
