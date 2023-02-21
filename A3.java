import java.io.*;
public class A3
{
public static void main(String args[])
{
try
    {
    //reading a file and copy the content from the file
    FileReader fr=new FileReader("/home/rajesh/java/MVI/f24/Students.txt");
    int i;
    int sum=0;
    String copy="";
    int average;

while((i=fr.read())!=-1)
    {
    copy=copy+((char)i);
    }
fr.close();
    System.out.println("content in the file is "+ copy);

String a[]=copy.split(" ");
int b[]= new int[a.length];

    for(int j=0;j<a.length;j++)
    {
    b[j]=Integer.parseInt(a[j]);
    sum=sum+b[j];
    }

System.out.println("Sum of all the element in the array is "+sum);
    average= sum/a.length;
System.out.println("Average of all the element in the array is "+average);
}
catch(Exception e)
    {
    e.printStackTrace();
    }
}
}
