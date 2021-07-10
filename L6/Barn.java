public class Barn
{
public static void main(String args[])
{
new Barn().go(1,"Hii");
new Barn().go(8,"Yoo","ioo");
}
public void go(int x,String...y)
{
System.out.print(y[y.length-1]+" ");
}
}