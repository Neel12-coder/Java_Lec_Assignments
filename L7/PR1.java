// wap to use all string methods
class PR1
{
public static void main(String args[])
{
String s="";
String s1=s.concat("Neelam");
System.out.println(s1);
s1=s1.replace("eelam","elesh");
System.out.println(s1);
s1=s1.substring(0,5);
System.out.println(s1);
int g=s1.indexOf('e'); // return type int

System.out.println(g);

int p=s1.lastIndexOf('e'); 

System.out.println(p);
char c=s1.charAt(3);  //return character

System.out.println(c);
int b=s1.compareTo(s); // returns ineger

System.out.println(b);
String s2=String.join("and","nelam","nand");

System.out.println(s2);
}
}