package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robo {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		Runtime.getRuntime().exec("notepad");
		Robot r1 = new Robot();
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_0);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_5);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_6);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_LEFT);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_3);
		Thread.sleep(2000);
		r1.keyRelease(KeyEvent.VK_LEFT);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_6);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_7);
		Thread.sleep(2000);
		

	}

}
