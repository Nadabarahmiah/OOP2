
package week71;

/**
 *
 * @author Nada
 */
public class FacadeTest {
 private Subsystem1 Subsystem1;  
private Subsystem2 Subsystem2;
    
public FacadeTest(){
    this.Subsystem1=new Subsystem1();
    this.Subsystem2=new Subsystem2();
}
public void operate(){
    System.out.println("FacadeTest");
    Subsystem1.Operation1();
    Subsystem2.Operation2();
}

    



}
