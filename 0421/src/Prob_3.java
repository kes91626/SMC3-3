import java.util.Scanner;

public class Prob_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Grade g = new Grade();
		System.out.print("수확|과학|영어 순으로 3개의 점수 입력 >> ");
		g.math=sc.nextInt();
		g.science=sc.nextInt();
		g.english=sc.nextInt();
		System.out.println("평균은 "+g.average());	
	}
}
class Grade{
	int math;
	int science;
	int english;
	public int average() {
		return (math+science+english)/3;
		
	}
}