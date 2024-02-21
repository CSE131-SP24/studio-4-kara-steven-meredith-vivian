package studio4;

import java.awt.Color;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
			/*JFileChooser chooser = new JFileChooser("resources");
			chooser.showOpenDialog(null);
			File f = new File(chooser.getSelectedFile().getPath());
			Scanner in = new Scanner(f); //making Scanner with a File*/ 
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(.5, .4, .3, .1);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(.5, .6, .3, .1);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(.5, .5, .1);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(.5, .5, "W");
	}
}