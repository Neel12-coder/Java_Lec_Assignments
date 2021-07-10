import java.io.*;

enum Selection 
{
ROCK , PAPER , SCISSOR;
int a;
}

class Game
{
public static void main(String args[])
{
Selection comp , user;
Console c = System.console();
int t=0,wuser=0,wcomp=0;
int n = Integer.parseInt(c.readLine("Enter number of matches "));
int i = 0;
while(i++ < n)
{
int r= (int) (Math.random() *3);    // will generate nos from 0 to 2.... similarly if we multiply by 55 , will generate nos till 54.
if (r==0)        comp = Selection.ROCK;
else if (r==1) comp = Selection.PAPER;
else comp = Selection.SCISSOR;

System.out.println("0. ROCK 1. PAPER 2. SCISSOR  ");
int o = Integer.parseInt(c.readLine("Enter option "));
if (o==0) user = Selection.ROCK;
else if (o==1) user = Selection.PAPER;
else user = Selection.SCISSOR;
System.out.println();
System.out.println("Comp = "+comp +" User = " +user);

if (comp==Selection.ROCK && user==Selection.ROCK)
t++;
else if (comp==Selection.SCISSOR && user==Selection.SCISSOR)
t++;
else if (comp==Selection.PAPER && user==Selection.PAPER)
t++;
else if (user==Selection.ROCK && comp== Selection.SCISSOR)   wuser++;
else if (user==Selection.PAPER && comp==Selection.ROCK)   wuser++;
else if (user==Selection.SCISSOR && comp==Selection.PAPER)   wuser++;
else if (user==Selection.ROCK && comp== Selection.PAPER)   wcomp++;
else if (user==Selection.PAPER && comp== Selection.SCISSOR)   wcomp++;
else if  (user==Selection.SCISSOR && comp== Selection.ROCK)   wcomp++;
}

System.out.println("TIE "+t +" USER WINS "+wuser+" COMP WINS "+wcomp);
try
{
String f ="Score.txt";
File fl = new File(f);
FileWriter fw = new FileWriter(fl,true);  // to append...
PrintWriter pw = new PrintWriter(fw);
String msg ="TIE "+t +" USER WINS "+wuser+" COMP WINS "+wcomp;
pw.println( msg +" "+new java.util.Date());
pw.close();
}
catch(IOException e)
{
System.out.println("writing mist "+e);
}
}}