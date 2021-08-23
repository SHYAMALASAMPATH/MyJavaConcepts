package com.propertiesdemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo
{
public static void main(String[] args) throws IOException 
{
Properties p = new Properties(); 
FileInputStream fis = new FileInputStream("C:\\MyJavaPrograms\\MyJavaConcepts\\src\\com\\propertiesdemos\\OR.Properties");
p.load(fis);
p.clear();
p.setProperty("name", "sampath");
p.setProperty("course", "selenium");
FileOutputStream fos = new FileOutputStream("C:\\MyJavaPrograms\\MyJavaConcepts\\src\\com\\propertiesdemos\\OR.Properties");
p.store(fos,"successfully added data into or properties file" );
System.out.println("properties file data is :"+p);
String s =p.getProperty("name");
System.out.println("in property file name value is :"+s);
p.setProperty("native", "manuguru");
p.store(fos, "native is updated successfully");
}

}
