import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		printNum(n);
	}


	public static void printNum(int n){
		if(n<1){
			return;
		}
		printNum(n-1);
		System.out.println(n);
	}
}