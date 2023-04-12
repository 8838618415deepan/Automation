package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile 
{
public static void main(String[] args) throws IOException
	{
FileInputStream fis=new FileInputStream("./data/commondata.property");
Properties p=new Properties();
p.load(fis);
String url=p.getProperty("url");
String un=p.getProperty("username");
String psw=p.getProperty("password");
System.out.println(url);
System.out.println(un);
System.out.println(psw);
	}
}
