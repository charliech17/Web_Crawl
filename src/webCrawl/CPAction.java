package webCrawl;

import java.awt.AWTException;
import java.awt.EventQueue;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;


import javax.swing.JButton;
import java.awt.Font;

public class CPAction 
{

	private JFrame frame;
	JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,btcopy;

	public static void main(String[] args) 
  {
		EventQueue.invokeLater
	(new Runnable() 
	   {	
			public void run() 
		   {
				try 
				{
					CPAction window = new CPAction();
				    window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
	 );
	}

	/**
	 * Create the application.
	 * @throws AWTException 
	* */
	public CPAction() throws AWTException 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws AWTException 
	 */
	private void initialize() throws AWTException 
	{
		frame = new JFrame();
		frame.setBounds(1200, 100, 157, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setAlwaysOnTop(true);
		
		bt1 = new JButton("架構");
		bt1.setBounds(28, 20, 87, 23);
		frame.getContentPane().add(bt1);
		Robot r1=new Robot();
		//按鍵一(架構)		
		bt1.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent arg0) {bt1Click(r1);}});
		
		bt2 = new JButton("聚會");
		bt2.setBounds(28, 66, 87, 23);
		frame.getContentPane().add(bt2);
		bt2.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent arg0) { bt2click(r1) ;}});
		
		bt3 = new JButton("身分");
		bt3.setBounds(28, 120, 87, 23);
		frame.getContentPane().add(bt3);
		bt3.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent arg0) { bt3click(r1) ;}});
		
		bt4 = new JButton("顯示方式");
		bt4.setBounds(28, 170, 87, 23);
		frame.getContentPane().add(bt4);
		bt4.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent arg0) { bt4click(r1) ;}});
		
		
		bt5 = new JButton("40/頁");
		bt5.setBounds(28, 220, 87, 23);
		frame.getContentPane().add(bt5);
		bt5.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent arg0) { bt5click(r1) ;}});
		
		bt6 = new JButton("更新資料");
		bt6.setBounds(28, 258, 87, 23);
		frame.getContentPane().add(bt6);
		bt6.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent arg0) { bt6click(r1) ;}});
		
		JButton bt7 = new JButton("恢復按鈕");
		bt7.setBounds(28, 353, 87, 23);
		frame.getContentPane().add(bt7);
		bt7.addActionListener(new ActionListener() {@Override
		public void actionPerformed(ActionEvent arg0) {bt1.setEnabled(true);bt2.setEnabled(true);bt3.setEnabled(true);bt4.setEnabled(true);bt5.setEnabled(true);}});
		
		btcopy = new JButton("選取、複製");
		btcopy.setFont(new Font("新細明體", Font.PLAIN, 10));
		btcopy.setBounds(28, 308, 87, 23);
		frame.getContentPane().add(btcopy);
		btcopy.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent arg0) { btcopyclick(r1) ;}});
	
	}
	
	public void mouseClick(Robot r1) 
	{
		r1.mousePress(InputEvent.BUTTON1_MASK);
		r1.mouseRelease(InputEvent.BUTTON1_MASK);	
	}
	
	public void bt1Click(Robot r1) 
	{
		r1.mouseMove(400, 300);    //會移動到架構
		mouseClick(r1);  
		r1.mouseMove(350, 340);    //點開彰化市召會
		mouseClick(r1);
		r1.mouseMove(365, 375);    //移動到一大區
		mouseClick(r1);
		r1.mouseMove(410, 410);    //移動到光華一
		mouseClick(r1);
		r1.mouseMove(410, 480);    //移動到光華二
		mouseClick(r1);
		r1.mouseMove(410, 515);    //移動到光華三
		mouseClick(r1);	
		r1.mouseMove(410, 445);    //移動到勝興
		mouseClick(r1);
		r1.mouseMove(410, 550);    //移動到向陽
		mouseClick(r1);
		r1.mouseMove(365, 375);    //移動到一大區
		mouseClick(r1);
		r1.mouseMove(365, 410);    //移動到二大區
		mouseClick(r1);
		r1.mouseMove(410, 480);    //移動到實踐
		mouseClick(r1);
		r1.mouseMove(410, 515);    //移動到長興
		mouseClick(r1);
		r1.mouseMove(410, 550);    //移動到彰泰
		mouseClick(r1);
		r1.mouseMove(365, 410);    //移動到二大區
		mouseClick(r1);
	    r1.mouseMove(365, 445);    //移動到三大區
		mouseClick(r1);
		r1.mouseMove(410, 480);    //移動到建寶
		mouseClick(r1);
		r1.mouseMove(410, 520);    //移動到博愛一
		mouseClick(r1);
		r1.mouseMove(410, 590);    //移動到博愛二
		mouseClick(r1);
		r1.mouseMove(365, 480);    //移動到三大區
		mouseClick(r1);
		r1.mouseMove(365, 515);    //移動到學生
		mouseClick(r1);
		r1.mouseMove(410, 545);    //移動到大專
		mouseClick(r1);
		r1.mouseMove(410, 580);    //移動到大專
		mouseClick(r1);
		r1.mouseMove(365, 515);    //移動到學生
		mouseClick(r1);
		r1.mouseMove(410, 200);    //移動開
		mouseClick(r1);
		bt1.setEnabled(false);
		
	}
	
	public void bt2click(Robot r1)
	{
		r1.mouseMove(400, 380);    //移動聚會
		mouseClick(r1);
		r1.mouseMove(410, 200);    //移動開
		r1.delay(200);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.delay(100);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.delay(100);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.delay(100);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.delay(100);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.delay(100);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.delay(100);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.delay(100);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.delay(100);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.delay(100);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.delay(100);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.delay(100);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.delay(100);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.delay(100);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.delay(100);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.delay(100);
		r1.mouseMove(410, 200);    //移動開
		mouseClick(r1);
		bt2.setEnabled(false);
		
	}
	
	
	public void bt3click(Robot r1) 
	{
		r1.mouseMove(400, 415);    //移動到身分
		mouseClick(r1);
		for(int i=0;i<=7;i++) {r1.keyPress(KeyEvent.VK_DOWN);r1.delay(100);}
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.delay(100);
		r1.mouseMove(410, 200);    //移動開
		mouseClick(r1);
		bt3.setEnabled(false);
	}
	
	public void bt4click(Robot r1) 
	{
		r1.mouseMove(400, 470);    //移動顯示方式
		mouseClick(r1);
		for(int i=0;i<=2;i++) {r1.keyPress(KeyEvent.VK_DOWN);r1.delay(100);}
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.delay(100);
		r1.mouseMove(410, 200);    //移動開
		mouseClick(r1);
		bt4.setEnabled(false);
	}
	
	

	public void bt5click(Robot r1) 
	{
		r1.mouseMove(1400, 665);
		mouseClick(r1);
		for(int i=0;i<=2;i++) {r1.keyPress(KeyEvent.VK_DOWN);r1.delay(100);}
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.delay(100);
		bt5.setEnabled(false);
	}

	
	public void bt6click(Robot r1) 
	{
		r1.mouseMove(350, 525); 
		mouseClick(r1);
		r1.delay(100);
	}
	
   public void btcopyclick(Robot r1) 
   {
		r1.mouseMove(300, 715); 
		r1.mousePress(InputEvent.BUTTON1_MASK);
		r1.mouseMove(1700, 715);
		r1.mouseMove(1700, 2000);
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_C);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_C);
		r1.mouseRelease(InputEvent.BUTTON1_MASK);
	   
   }

}

