import java.util.Scanner;

public class Game {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("[1: ���� |2: ���� |3: ��]");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		int com = (int)(Math.random() * 3 + 1);
		System.out.println(com);
		
		if(user==1 | com==3){
			System.out.println("���� ��");
		}
		else if(user==2 | com==1){
			System.out.println("���� ��");
		}
		else if(user==3 | com==2){
			System.out.println("���� ��");
		}
		else if(user==1 | com==2){
			System.out.println("�� ��");
		}
		else if(user==2 | com==3){
			System.out.println("�� ��");
		}
		else if(user==3 | com==1){
			System.out.println("�� ��");
		}
		else{
			System.out.println("���º�");
		}
	
		

	}
	
	

}
