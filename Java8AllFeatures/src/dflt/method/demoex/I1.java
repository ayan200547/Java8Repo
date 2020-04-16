package dflt.method.demoex;

public interface I1 {
	default public void display() {
		System.out.println("Inside I1");
	}
}
