class CurrentAccount
{
private double bal;
private int number;

public CurrentAccount(int number)
{
this.number=number;
}

public void Deposit(double amt)
{
bal=bal+amt;
System.out.println("Deposited "+amt);
System.out.println("Your current balance is:  "+bal);
}

public void Withdraw(double amt) throws InsufficientException
{
if (amt<=bal)
{
bal=bal-amt;
System.out.println("Successfull ");
System.out.println("Your current balance is:  "+bal);
}
else
{
double need=amt-bal;
throw new InsufficientException(need);
}
}
}

class InsufficientException extends Exception 
{
private double s;
public InsufficientException(double n)
{
this.s=n;
}
public double getamount(){
return s;}
}

class Test
{
public static void main(String args[])
{
CurrentAccount c=new CurrentAccount(2);
try{
c.Deposit(500);
c.Withdraw(100);
c.Withdraw(600);}
catch(InsufficientException e) {
System.out.println("You are short of "+e.getamount());}

}}