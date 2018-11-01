import static org.junit.Assert.assertEquals;
import org.junit.Test;


// ****** Test cases: Strings of length 10 ******
public class Program0Tester {
  @Test
  public void evaluatesExpression() {
    Program0 test0 = new Program0();
    boolean bug = false;


// ****** method0 test cases ******
    bug = test0.method0("aboklatesd");
    System.out.printf("\nbug=%b", bug);
    // assertEquals(false, bug);

    bug = test0.method0("aicobmsjqw");
    System.out.printf("\nbug=%b", bug);
    // assertEquals(false, bug);

    bug = test0.method0("helloworld");
    System.out.printf("\nbug=%b", bug);
    // assertEquals(false, bug);

    bug = test0.method0("hyowodxxsb");
    System.out.printf("\nbug=%b", bug);
    // assertEquals(false, bug);


// ****** method1 test cases ******
    bug = test0.method1("bcoadgasds");
    System.out.printf("\nbug=%b", bug);
    // assertEquals(false, bug);

    bug = test0.method1("mhmsdtyoax");
    System.out.printf("\nbug=%b", bug);
    // assertEquals(false, bug);

    bug = test0.method1("herroyouuh");
    System.out.printf("\nbug=%b", bug);
    // assertEquals(false, bug);

    bug = test0.method1("lpokiqmcte");
    System.out.printf("\nbug=%b", bug);
    // assertEquals(false, bug);
  }
}
