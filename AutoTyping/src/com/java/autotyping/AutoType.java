package com.java.autotyping;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class AutoType {
	public static void main(String[] args) {

		try {
			Runtime.getRuntime().exec("notepad.exe");
			Thread.sleep(2000);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_M);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_Y);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_N);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_A);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_M);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_E);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_I);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_S);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_R);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_I);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_N);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_I);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_W);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_I);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_L);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_S);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_O);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_N);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_C);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_T);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_H);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_I);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_S);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_M);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_E);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_S);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_S);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_A);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_G);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_E);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_F);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_O);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_R);			
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_CAPS_LOCK);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_R);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_I);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_N);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_O);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_W);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_I);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_L);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_S);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_O);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_N);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_C);
			Thread.sleep(500);	
			r.keyPress(KeyEvent.VK_INPUT_METHOD_ON_OFF);
			Thread.sleep(500);	
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_QUOTE);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_1);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_A);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_QUOTE);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// extra comments added

	}
}
