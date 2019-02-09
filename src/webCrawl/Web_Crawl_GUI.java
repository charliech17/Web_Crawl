package webCrawl;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Web_Crawl_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField tx1;
	private JTextField tx2;
	private JPasswordField epf;
	private JButton btn1,btn2;
	private JTextField textField;
	private final JLabel tx3 = new JLabel("\u75DE\u5BA2\u90A6\u767B\u5165\u7CFB\u7D71");
    public static WebDriver driver=null; 
    private JCheckBox chkbox;
    private int count=0;
    
	//Main method
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {framestart();} catch (Exception e) {e.printStackTrace();}
		    }

			private void framestart() {
				Web_Crawl_GUI frame = new Web_Crawl_GUI();
				frame.setVisible(true);
				
				frame.addWindowListener(new java.awt.event.WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						driver.quit();
					}
				});
				
				frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
					    KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "EXIT"); 
					    frame.getRootPane().getActionMap().put("EXIT", new AbstractAction(){ 
					        public void actionPerformed(ActionEvent e)
					        {
					        	driver.quit();
					        	frame.dispose();
					        	System.exit(0);
					        }
					    });
				
			}});
		}
       
	
	
	//GUI Settings
	public Web_Crawl_GUI() {
		
		Thread t1=new MyThread();
		 t1.start();
		
		setTitle("Logging");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tx1 = new JTextField();
		tx1.setEditable(false);
		tx1.setBackground(Color.BLUE);
		tx1.setHorizontalAlignment(SwingConstants.CENTER);
		tx1.setFont(new Font("新細明體", Font.PLAIN, 16));
		tx1.setText("\u8F38\u5165\u5E33\u865F");
		tx1.setBounds(10, 58, 96, 21);
		contentPane.add(tx1);
		tx1.setColumns(10);
		
		tx2 = new JTextField();
		tx2.setText("\u8F38\u5165\u5BC6\u78BC");
		tx2.setHorizontalAlignment(SwingConstants.CENTER);
		tx2.setFont(new Font("新細明體", Font.PLAIN, 16));
		tx2.setEditable(false);
		tx2.setColumns(10);
		tx2.setBackground(Color.BLUE);
		tx2.setBounds(10, 115, 96, 21);
		contentPane.add(tx2);
		
	
		tx3.setFont(new Font("新細明體", Font.PLAIN, 20));
		tx3.setBounds(75, 10, 147, 31);
		contentPane.add(tx3);
		
		btn1 = new JButton("\u767B\u5165");
		btn1.setBounds(31, 181, 87, 23);
		contentPane.add(btn1);
		
		btn2 = new JButton("\u6E05\u9664");
		btn2.setBounds(165, 181, 87, 23);
		contentPane.add(btn2);
		
		textField = new JTextField();
		textField.setBounds(116, 60, 106, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		epf = new JPasswordField();
		epf.setBounds(116, 117, 106, 21);
		contentPane.add(epf);
		
		chkbox = new JCheckBox("\u4FDD\u6301\u767B\u5165\u72C0\u614B?");
		chkbox.setBounds(0, 152, 118, 23);
		contentPane.add(chkbox);
	
		btn1.addActionListener((ActionListener) new btn1Listener());
		btn2.addActionListener((ActionListener) new btn2Listener());
		keypress();
	}
	


	class MyThread extends Thread{
		public void run() {
			try {
				driver = new ChromeDriver();   
			    driver.get("http://charliech17.pixnet.net/blog");
				
			    Actions action = new Actions(driver);
			    action.sendKeys(Keys.ESCAPE).build().perform();
			    
			    WebDriverWait wait = new WebDriverWait (driver, 30); 
			    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"blog-main\"]/div[2]/header/div/section/div/div[1]/ul/li[3]/span"))).click();
			    
			}catch(Exception ex) {}
			
			
			
		}
		
	}
	 
	
	class btn1Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
			if(count==0){
				
			
				WebDriverWait wait2=new WebDriverWait(driver,30);
				wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"signup__form--post\"]/button")));
				
				char[] passward=epf.getPassword();
				String passText = new String(passward);
				String username=textField.getText();
				
				WebElement we1=driver.findElement(By.xpath("//*[@id=\"signup__form--post\"]/div[1]/input"));;
				we1.sendKeys(username);
				
				WebElement we2=driver.findElement(By.xpath("//*[@id=\"signup__form--post\"]/div[2]/input"));
				we2.sendKeys(passText);
				epf.setText("");
				passward=epf.getPassword();
				
				if(!chkbox.isSelected()){
					WebElement we4=driver.findElement(By.xpath("//*[@id=\"signup__form--post\"]/div[3]/label/input"));
					we4.click();
				}
				
				
				WebElement we3=driver.findElement(By.xpath("//*[@id=\"signup__form--post\"]/button"));
				we3.click();
				
				try{Thread.sleep(500);}catch(Exception ex) {}
				
				String currentURL = driver.getCurrentUrl();
			    if(currentURL!="https://member.pixnet.cc/login/verify"){
			    	btn1.setText("登出");
			    	count+=1;
			    }
			}else {
				driver.navigate().to("https://panel.pixnet.cc/logout?done=https%3A%2F%2Fmember.pixnet.cc%2Flogout%3Fdone%3Dhttp%253A%252F%252Fcharliech17.pixnet.net%252Fblog");
				btn1.setText("登入");
				driver.navigate().to("https://member.pixnet.cc/login/verify");
				count-=1;
			}
				
			}	
			
		}
		
		
	

	class btn2Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			textField.setText("");
			epf.setText("");

		}
	}
	
	private void keypress() {
		
		epf.addKeyListener(new KeyAdapter()

     	{

     		public void keyPressed(KeyEvent key)

	      	{

	      		if(key.getKeyChar() == KeyEvent.VK_ENTER)

	      			btn1.doClick();
	      		
	      	}

     	});
	
	
		btn1.addKeyListener(new KeyAdapter()

     	{

     		public void keyPressed(KeyEvent key)

	      	{

	      		if(key.getKeyChar() == KeyEvent.VK_ENTER)

	      			btn1.doClick();

	      	}

     	});
		
		btn2.addKeyListener(new KeyAdapter()

     	{

     		public void keyPressed(KeyEvent key)

	      	{

	      		if(key.getKeyChar() == KeyEvent.VK_ENTER)

	      			btn2.doClick();

	      	}

     	});
	}
	

}
