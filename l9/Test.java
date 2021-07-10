abstract class RBI
{
int accno;
String name;
double bal;

public RBI(int accno,String name,double bal) 
// it cannot be interface becoz interface mai consstructors nahi hote...
{
this.accno=accno;
this.name=name;
this.bal=bal;
}

void show()
{
System.out.println(name+" "+accno+" "+bal);
}

public abstract void Deposit(double amt);
public abstract void Withdraw(double amt);
}

class Nayabank extends RBI
{

Nayabank(int accno,String name, double bal)
{
super(accno,name,bal); }

public void Deposit(double amt) //if yaha p public nahi likha error-trying to give weaker acceses privelages....
{
bal=bal+amt-10;
}

public void Withdraw(double amt)
{
bal=bal-amt-10;
}
}
class Test
{
public static void main(String args[])
{
Nayabank n=new Nayabank(5,"mannat",80000);
n.show();
n.Deposit(900);
n.show();
n.Withdraw(100);
n.show();
}
}

