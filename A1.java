import java.util.*;
public class A1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("write a sentence with atleast 10 words");
String s=sc.nextLine();
String output="";
String w[]=s.split(" ");
char a[]=s.toCharArray();
//counting consonents in each word
System.out.println("no of consonents in each word");
for(int i=0;i<w.length;i++)
{
String word=w[i];
int count=0;
for(int j=0;j<word.length();j++)
{
char c=word.charAt(j);
if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='A' && c!='E' && c!='I' && c!='O' && c!='U')
count++;
}
System.out.println(word+" : " + count);
}

//converting 1st letter lowecase and last letter upper case
for(int i=0;i<a.length-1;i++)
{

if(i==0 && a[i]>='A' && a[i]<='Z')
a[i]=(char)(a[i]+32);

else if(a[i]==' ' && a[i+1]>='A' && a[i+1]<='Z')
a[i+1]=(char)(a[i+1]+32);

else if(a[i+1]==' ' && a[i]>='a' && a[i]<='z')
a[i]=(char)(a[i]-32);

if(i==a.length-1 && a[i]>='a' && a[i]<='z')
a[i]=(char)(a[i]-32);

}
for(int i=0; i<a.length;i++)
{
output=output+a[i];
}
System.out.println("after converting first letter to lower case and last letter upper case");
System.out.println(output);

}
}
