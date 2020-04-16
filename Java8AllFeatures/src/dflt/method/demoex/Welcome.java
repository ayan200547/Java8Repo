package dflt.method.demoex;

public class Welcome implements I1,I{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		I.super.display();
	}
	public static void main(String[] args) {
		Welcome welcome = new Welcome();
		welcome.display();
	}
}
