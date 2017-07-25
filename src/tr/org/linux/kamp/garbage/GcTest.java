package tr.org.linux.kamp.garbage;

public class GcTest {
	int value;
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("garbage çalıştı");
	}
}
