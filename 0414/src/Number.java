import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("10���� ���� ���� �� �ϳ��� ���纸���� : ");
		int number = sc.nextInt();
		
		int diff =0;
		int[] rand = new int[10]; 	
		for(int i=0; i<10; i++){
			rand[i] = (int)(Math.random() * 50 + 1);
			System.out.print(rand[i]+" ");
		}
		System.out.println("");
		
		for(int j=0; j<10; j++){
			if(rand[j] == number){
				System.out.println("����");
				diff=1;
			}
		}
		if(diff==0)System.out.println("��!");
		
		
	}

}
