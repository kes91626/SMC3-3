import java.util.Scanner;

public class Prob_01 {
	
		public static void main(String args[]){
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("����, ����, ���� ������ 3���� ���� �Է�>>");
			int math = scanner.nextInt();
			int science = scanner.nextInt();
			int english = scanner.nextInt();
			Grade me = new Grade(math, science, english);
			System.out.println("����� "+me.average());
		}
	}
class Grade{
		int math;
		int science;
		int english;
		
	public Grade(int math, int science, int english){
		this.math = math;
		this.science =science;
		this.english = english;
	}
	public int average(){
		return(math+science+english)/3;
		}
	}