import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int i,index=0,max=0;
		
		for( i=0; i<5; i++){
			System.out.println((i+1)+"번 입력 : ");
			num[i]=sc.nextInt();
			
			if(max<num[i]){
				max=num[i];
				index= i+1;
			}
	}
		System.out.println(index+"번째 숫자 "+max);
	
	}
}
