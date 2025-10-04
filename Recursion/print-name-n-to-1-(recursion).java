import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		printNum(n);
	}


	public static void printNum(int n){
		if(n==0){
			return;
		}
		System.out.println(n);
		printNum(n-1);
	}
}