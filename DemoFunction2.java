
public class DemoFunction2 {

	static void pattern(char ch1,int num1,char ch2,int num2) {
		for(int i=1;i<=num1;i++) {
			System.out.println(ch1);
		}
	System.out.println();
	for(int i=1;i<=num2;i++) {
		System.out.println(ch2);
	}
    System.out.println();
	}
	public static void main(String  []abc) {
		pattern('*',20,'-',25);
				System.out.println("Welcome");
		pattern('.',25,'-',20);
		System.out.println("Hyderabad");
	}
}
