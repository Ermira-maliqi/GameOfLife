import java.awt.Color;

import javax.swing.*;

public class Frame {
		
	Panel p = new Panel();

			public Frame() {
	    	JFrame f = new JFrame();
	    	f.setSize(415,480);
			f.setVisible(true);
			f.setTitle("                                 Game of Life");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.getContentPane().add(p);
	    
		}
	}