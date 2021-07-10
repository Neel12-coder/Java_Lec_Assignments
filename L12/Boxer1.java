public class Boxer1
{
Integer i=0; //autoboxing
int x;
public Boxer1(int y){
x=i+y; //Autounboxing 
System.out.print(x);
}
public static void main(String args[])
{
new Boxer1(new Integer(4) ); //udta hua obj
}
}
