package dflt.method.demoex;

public interface I {
	default public void display() {
		System.out.println("Inside I");
	} 
}
