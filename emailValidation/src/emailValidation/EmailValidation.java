package emailValidation;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		String [] email = new String [10];
		email[0]="a.gmail.com";
		email[1]="b.gmail.com";
		email[2]="c.gmail.com";
		email[3]="d.gmail.com";
		email[4]="e.gmail.com";
		email[5]="f.gmail.com";
		email[6]="g.gmail.com";
		email[7]="h.gmail.com";
		email[8]="i.gmail.com";
		email[9]="j.gmail.com";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter user email ID");
		String user = sc.nextLine();
		boolean b = false;
		try {
			for(int i=0; i<email.length; i++) {
				if(email[i].equals(user)) {
					b = true;
				}
			}
			if(b) {
			System.out.println("user email present in array\n");
			}
			else {
				System.out.println("user email not found in array");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
