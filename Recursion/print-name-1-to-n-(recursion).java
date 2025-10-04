import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		printName(1,n);
	}


	public static void printName(int i, int n){
		if(i>n){
			return;
		}
		System.out.println("Ram");
		printName(i+1,n);
	}
}