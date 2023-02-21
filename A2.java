import java.util.*;
public class A2
{
public static void main(String args[])
{
Map<Integer,String> m=new HashMap<Integer,String>();
Scanner sc =new Scanner(System.in);

for(int i=0;i<=3;i++)
{
    System.out.println("Enter key in integer ");
    int key =sc.nextInt();
    System.out.println("Enter value in string");
    String value= sc.next();
    m.put(key,value);
}
Iterator <Map.Entry <Integer,String> > itr = m.entrySet().iterator();
while(itr.hasNext())
{
Map.Entry<Integer,String> e = itr.next();
if((e.getValue()).length() >10)
{
itr.remove();
}
}

System.out.println("contents present in the map is");
System.out.println(m);

}
}
