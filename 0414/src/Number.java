import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요 : ");
		int number = sc.nextInt(); //스캐너 생성
		
		int diff =0; 	// 당첨되면 1 당첨되지 않으면 0
		int[] rand = new int[10]; 	
		for(int i=0; i<10; i++){
			rand[i] = (int)(Math.random() * 50 + 1);
			System.out.print(rand[i]+" ");
		}
		System.out.println("");
		
		for(int j=0; j<10; j++){
			if(rand[j] == number){
				System.out.println("정답");
				diff=1;		//당첨 되었으니 1
			}
		}
		if(diff==0)System.out.println("꽝!");	//꽝이면 0
		
		
	}

}
