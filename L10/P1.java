//demo of using lambda function
interface Dem  //Functional Interface...
{
void fun();           //all methods in interface are by default abstract and public....
}
class P1
{
public static void main(String args[])
{
Dem a = () -> System.out.println("Hellooo");
a.fun();
Dem b = () ->{ System.out.println("HIIIIIII"); System.out.println("Jinmin");};
b.fun();
Dem c = () ->{ System.out.println("Ooooooops");};
c.fun(); 


}
}

