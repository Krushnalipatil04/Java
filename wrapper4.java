public class wrapper4
{
public static void main(String args[])
{

int i=30;
float f=50.0F;
char c='a';
boolean b2=true;

//Autoboxing: Converting primitives into objects
Integer intobj=i;
Float floatobj=f;
Character charobj=c;
Boolean boolobj=b2;

//Printing objects
System.out.println("---Printing object values---");
System.out.println("Integer object: "+intobj);
System.out.println("Float object: "+floatobj);
System.out.println("Character object: "+charobj);
System.out.println("Boolean object: "+boolobj);

//Unboxing: Converting Objects to Primitives

int intvalue=intobj;
float floatvalue=floatobj;
char charvalue=charobj;
boolean boolvalue=boolobj;

//Printing primitives
System.out.println("---Printing primitive values---");
System.out.println("int value: "+intvalue);
System.out.println("float value: "+floatvalue);
System.out.println("char value: "+charvalue);
System.out.println("boolean value: "+boolvalue);
}
}