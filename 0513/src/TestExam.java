import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("500 ������ �ڿ����� �Է��ϼ���.");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=2; i<=num; i++){
			if(i%3==0 && i%7==0){
				System.out.println(i);
				sum = sum+i;
		}
			
	}
		System.out.println("1~" + num + "���� 3�� ����̸鼭 7�� ����� ���� ����" + sum +"�Դϴ�." );
	}


}
