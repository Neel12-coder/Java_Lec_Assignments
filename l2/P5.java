/*wap to read price of an item if price>100 discount of 5%
if price>80 discount is 3% else 2%*/
class P5
{public static void main(String args[])
{
float n1=Float.parseFloat(args[0]);
float result=n1>100?5:n1>80?3:2;
float price=n1-(n1*(result/100));
System.out.println("The price after discount of: "+ (result)+" is "+price);
}
}
