//demo of using lambda function
interface Dem  //Functional Interface...
{
void fun();           //all methods in interface are by default abstract and public....
}
class P1
{
public static void main(String args[])
{
P1 a = () -> System.out.println("Hellooo");
a.fun()
}
}

