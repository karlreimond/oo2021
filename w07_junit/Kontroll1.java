import org.junit.*;
import static org.junit.Assert.*;

public class Kontroll1{
	@Test
	public void esimene(){
		System.out.println("Testi automaatkäivitus");
	}
	@Test
	public void arvutus1(){
	   assertEquals(6, Abifunktsioonid.geomKeskmine(new double[]{4, 9}), 0.001);
	}
	@Test
	public void arvutus2(){
	   assertEquals(3, Abifunktsioonid.geomKeskmine(new double[]{1, 3, 9}), 0.001);
	}
}

/*
[jaagup@greeny testid]$ javac -cp junit4.jar:. Kontroll1.java
[jaagup@greeny testid]$ java -cp junit4.jar:. org.junit.runner.JUnitCore Kontroll1
JUnit version 4.8.2
..Testi automaatkäivitus
.
Time: 0.018

OK (3 tests)


*/