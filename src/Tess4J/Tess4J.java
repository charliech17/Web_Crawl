package Tess4J;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Tess4J {
  public static void main(String arg[]) {
	  File imgfile=new File("C:\\Users\\user\\Desktop\\1234.png");
	  if(!imgfile.exists()) {
		  System.out.print("�Ϥ����s�b");
		  
	  }
	  
	  Tesseract tessreact = new Tesseract();	
	  tessreact.setDatapath("");
	  
	  String result;
	  try {
		  result = "�Ϥ�������r�G" + tessreact.doOCR(imgfile);
		  System.out.println(result);
	  }catch(TesseractException ex){ex.printStackTrace();}
	     
	  
	  
  }
}
