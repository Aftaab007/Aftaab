import java.util.Scanner;

public class CurrenyConv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String country=sc.next();
		String cC=getAmtDetails(country);
		System.out.println("please enter"+cC);
		System.out.println("Please enter" +cC);
		if(cC.equalsIgnoreCase("Country not found")) {
			System.out.println("not able to process");
		}
		else {
			int amt=sc.nextInt();
	    System.out.println("for this"+country+"for this amt="+amt+"indian amt="(country,amt));
		}
}
	static String getAmtDetails(String country) {
		String res="";
		if(country.equalsIgnoreCase("USA")) {
			res="dollar";
		}
		else if(country.equalsIgnoreCase("uk")) {
			res="dirham";
		}
		else {
			res="country not found";
		}
		return res;
	}
}
