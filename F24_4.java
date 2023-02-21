import java.util.*;
public class F24_4
{
public static void main(String args[])
{
String s="java is high leveL class baseD object oriented programminG language";
String output="";
char a[]=s.toCharArray();

//converting 1st letter caps
for(int i=0;i<a.length-1;i++)
{

if(i==0 && a[i]>='a' && a[i]<='z')
a[i]=(char)(a[i]-32);

else if(a[i]==' ' && a[i+1]>='a' && a[i+1]<='z')
a[i+1]=(char)(a[i+1]-32);
}
//converting character array to string
for(int i=0; i<a.length;i++)
{
output=output+a[i];
}
System.out.println(output);
//converting string to string array and adding the element in linked list
String b[]=output.split(" ");

List<String> ll= new LinkedList<String>();
for(int i=0; i<b.length;i++)
{
ll.add(b[i]);
}
System.out.println("elements in linkedlist "+ ll);

}
}
