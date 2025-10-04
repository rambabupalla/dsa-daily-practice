import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		printNum(1,n);
	}


	public static void printNum(int i, int n){
		if(i>n){
			return;
		}
		printNum(i+1,n);
		System.out.println(i);
	}
}