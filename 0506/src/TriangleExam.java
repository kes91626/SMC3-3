
public class TriangleExam {

	public static void main(String[] args) {
		Triangle t = new Triangle(10.2, 17.3);
		System.out.println("삼각형 넓이 : " + t.area());
		t.change(7.5, 9.2);
		System.out.println("삼각형 넓이 : " + t.area());
	}
}

class Triangle{
	double h ;
	double w ;
	
public Triangle(double h, double w){
		this.h = h;
		this.w = w;
		
	}
	
	void change(double h, double w){
		this.h=h;
		this.w=w;
	}
	
	public double area(){
		return h*w/2;
		
	}
}
