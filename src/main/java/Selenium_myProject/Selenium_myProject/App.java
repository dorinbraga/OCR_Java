package Selenium_myProject.Selenium_myProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class App 
{
	
    public static void main(String []args) throws IOException, TesseractException
    {
    	
    	ITesseract image = new Tesseract();
    	
		String str = image.doOCR(new File("D:\\New folder\\New folder\\poza.jpg"));		
			
		String mydata = str.replaceAll("[0-9]", " ");
			
		System.out.println(mydata);
			
		//printarea textului intr-un file
		FileWriter myWriter = new FileWriter("D:\\New folder\\New folder\\filename.txt");
	  	myWriter.write(mydata);
	  	myWriter.close();

    }
}

