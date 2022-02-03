package com.tdec.eLove;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Picture {
	private ImageIcon image;
	private JLabel label;
	
	public JLabel load(String path) {
		image = new ImageIcon(path);
		label = new JLabel();
		
		label.setIcon(image);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVisible(false);
		
		return label;
	}
}
