import java.util.Scanner;

public class DemoChar {

	 static void pattern(char ch,int c ) {
		 for(int i=1;i<=c;i++)
			 System.out.println(ch);
		 
	}
    public static void main(String[] args) {
    	char ch;
    	int i;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Character");
    	ch=sc.next().charAt(1);
    	Scanner sc1 = new Scanner(System.in);
    	System.out.println("Enter The Number");
    	i=sc1.nextInt();
    	
    	pattern(ch,i);
    }
    }
