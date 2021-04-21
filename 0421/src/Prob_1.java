import java.util.Scanner;

public class Prob_1 {

		public static void main(String[] args) {
			int sum=0;
			Scanner scan = new Scanner(System.in);
			System.out.print("시작 숫자 : ");
			int first = scan.nextInt();

			System.out.print("마지막 숫자 : ");
			int last = scan.nextInt();
		
			for(int i = first; i<=last; i++ ){
				sum+=i;
	

			
			}
			System.out.println(first + "부터 " + last + "까지의 합은 " + sum);
		}

	}