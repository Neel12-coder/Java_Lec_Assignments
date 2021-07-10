class PrintA extends Thread{
public void run(){
System.out.println("A");
}
}
public class PrintB
{
public static void main(String args[])
{
Thread a= new PrintA();
a.run();
System.out.println("B");

}}