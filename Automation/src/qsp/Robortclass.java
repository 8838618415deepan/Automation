package qsp;

import java.awt.AWTException;
import java.awt.Event;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Driver;

public class Robortclass 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException
	{
Runtime.getRuntime().exec("notepad.exe");
Thread.sleep(3000);
Robot r=new Robot();
r.keyPress(KeyEvent.VK_Q);
r.keyPress(KeyEvent.VK_S);
r.keyPress(KeyEvent.VK_P);
	}
}
