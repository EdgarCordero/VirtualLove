package com.tdec.eLove;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
	
public class UIManager {
	public static int width = 900;
	public static int height = width/16*9;
	public static int input = 0;
	
	public static JLabel lable1;
	public static JLabel lable2;
	public static JLabel lable3;
	public static JLabel lable4;
	public static JLabel lable5;
	public static JLabel lable6;
	public static JLabel lable7;
	public static JLabel lable8;
	public static JLabel lable9;
	public static JLabel lable10;
	public static JLabel lable11;
	public static JLabel lable12;
	public static JLabel lable13;
	public static JLabel lable14;
	public static JFrame frame;
	public static JPanel panel;
	
	public Picture pic1 = new Picture();
	public Picture pic2 = new Picture();
	public Picture pic3 = new Picture();
	public Picture pic4 = new Picture();
	public Picture pic5 = new Picture();
	public Picture pic6 = new Picture();
	public Picture pic7 = new Picture();
	public Picture pic8 = new Picture();
	public Picture pic9 = new Picture();
	public Picture pic10 = new Picture();
	public Picture pic11 = new Picture();
	public Picture pic12 = new Picture();
	public Picture pic13 = new Picture();
	public Picture pic14 = new Picture();
	
	
	static JButton buttonFlirt = new JButton("Elogiar");
	static JButton buttonInsult = new JButton("Insultar");
	static JButton buttonGift = new JButton("Dar regalo");
	static JButton buttonLie = new JButton("Miente");
	static JButton buttonKiss = new JButton("Besar");
	static JButton buttonJoke = new JButton("Bromear");
	static JButton buttonListen = new JButton("Escuchar");
	static JButton buttonIgnore = new JButton("Ignorar");
	static JButton buttonSeduce = new JButton("Seducir");
	static JButton buttonGoOut = new JButton("Salir con amigos");
	
	public void setUI(){
		
		lable1 = pic1.load("res/sonrie.png");
		lable2 = pic2.load("res/sonroja.png");
		lable3 = pic3.load("res/llanto.png");
		lable4 = pic4.load("res/golpea.png");
		lable5 = pic5.load("res/amenazar.png");
		lable6 = pic6.load("res/rie.png");
		lable7 = pic7.load("res/desaprueba.png");
		lable8 = pic8.load("res/indiferencia.png");
		lable9 = pic9.load("res/agradecer.png");
		lable10 = pic10.load("res/enfurecer.png");
		lable11 = pic11.load("res/sorprende.png");
		lable12 = pic12.load("res/celebrar.png");
		lable13 = pic13.load("res/aprobar.png");
		lable14 = pic14.load("res/amor.png");
		
		frame = new JFrame();
		frame.setSize(width, height);
		frame.setResizable(true);
		frame.setTitle("Virtual Love");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(width/4, height));
		panel.setBackground(Color.MAGENTA);
		panel.setLayout(new FlowLayout());
		
		panel.add(buttonFlirt);
		panel.add(buttonInsult);
		panel.add(buttonGift);
		panel.add(buttonLie);
		panel.add(buttonKiss);
		panel.add(buttonJoke);
		panel.add(buttonListen);
		panel.add(buttonIgnore);
		panel.add(buttonSeduce);
		panel.add(buttonGoOut);
		
		frame.add(panel);
		
		frame.add(lable1);
		frame.add(lable2);
		frame.add(lable3);
		frame.add(lable4);
		frame.add(lable5);
		frame.add(lable6);
		frame.add(lable7);
		frame.add(lable8);
		frame.add(lable9);
		frame.add(lable10);
		frame.add(lable11);
		frame.add(lable12);
		frame.add(lable13);
		frame.add(lable14);

		
		buttonFlirt.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == buttonFlirt) {
							input = 0;
						}
					}
				}
				);
		
		buttonInsult.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == buttonInsult) {
							input = 1;
						}
					}
				}
				);
		
		buttonGift.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == buttonGift) {
							input = 2;
						}
					}
				}
				);
		
		buttonLie.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == buttonLie) {
							input = 3;
						}
					}
				}
				);
		
		buttonKiss.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == buttonKiss) {
							input = 4;
						}
					}
				}
				);
		
		buttonJoke.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == buttonJoke) {
							input = 5;
						}
					}
				}
				);
		
		buttonListen.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == buttonListen) {
							input = 6;
						}
					}
				}
				);
		
		buttonIgnore.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == buttonIgnore) {
							input = 7;
						}
					}
				}
				);
		
		buttonSeduce.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == buttonSeduce) {
							input = 8;
						}
					}
				}
				);
		
		buttonGoOut.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == buttonGoOut) {
							input = 9;
						}
					}
				}
				);
		
		frame.setVisible(true);
		
	}
	
	public void clearForLabel1() {
		lable2.setVisible(false);
		lable3.setVisible(false);
		lable4.setVisible(false);
		lable5.setVisible(false);
		lable6.setVisible(false);
		lable7.setVisible(false);
		lable8.setVisible(false);
		lable9.setVisible(false);
		lable10.setVisible(false);
		lable11.setVisible(false);
		lable12.setVisible(false);
		lable13.setVisible(false);
		lable14.setVisible(false);
	}
	
	public void clearForLabel2() {
		lable1.setVisible(false);
		lable3.setVisible(false);
		lable4.setVisible(false);
		lable5.setVisible(false);
		lable6.setVisible(false);
		lable7.setVisible(false);
		lable8.setVisible(false);
		lable9.setVisible(false);
		lable10.setVisible(false);
		lable11.setVisible(false);
		lable12.setVisible(false);
		lable13.setVisible(false);
		lable14.setVisible(false);
	}
	
	public void clearForLabel3() {
		lable1.setVisible(false);
		lable2.setVisible(false);
		lable4.setVisible(false);
		lable5.setVisible(false);
		lable6.setVisible(false);
		lable7.setVisible(false);
		lable8.setVisible(false);
		lable9.setVisible(false);
		lable10.setVisible(false);
		lable11.setVisible(false);
		lable12.setVisible(false);
		lable13.setVisible(false);
		lable14.setVisible(false);
	}
	
	public void clearForLabel4() {
		lable1.setVisible(false);
		lable2.setVisible(false);
		lable3.setVisible(false);
		lable5.setVisible(false);
		lable6.setVisible(false);
		lable7.setVisible(false);
		lable8.setVisible(false);
		lable9.setVisible(false);
		lable10.setVisible(false);
		lable11.setVisible(false);
		lable12.setVisible(false);
		lable13.setVisible(false);
		lable14.setVisible(false);
	}
	
	public void clearForLabel5() {
		lable1.setVisible(false);
		lable2.setVisible(false);
		lable3.setVisible(false);
		lable4.setVisible(false);
		lable6.setVisible(false);
		lable7.setVisible(false);
		lable8.setVisible(false);
		lable9.setVisible(false);
		lable10.setVisible(false);
		lable11.setVisible(false);
		lable12.setVisible(false);
		lable13.setVisible(false);
		lable14.setVisible(false);
	}
	
	public void clearForLabel6() {
		lable1.setVisible(false);
		lable2.setVisible(false);
		lable3.setVisible(false);
		lable4.setVisible(false);
		lable5.setVisible(false);
		lable7.setVisible(false);
		lable8.setVisible(false);
		lable9.setVisible(false);
		lable10.setVisible(false);
		lable11.setVisible(false);
		lable12.setVisible(false);
		lable13.setVisible(false);
		lable14.setVisible(false);
	}
	
	public void clearForLabel7() {
		lable1.setVisible(false);
		lable2.setVisible(false);
		lable3.setVisible(false);
		lable4.setVisible(false);
		lable5.setVisible(false);
		lable6.setVisible(false);
		lable8.setVisible(false);
		lable9.setVisible(false);
		lable10.setVisible(false);
		lable11.setVisible(false);
		lable12.setVisible(false);
		lable13.setVisible(false);
		lable14.setVisible(false);
	}
	
	public void clearForLabel8() {
		lable1.setVisible(false);
		lable2.setVisible(false);
		lable3.setVisible(false);
		lable4.setVisible(false);
		lable5.setVisible(false);
		lable6.setVisible(false);
		lable7.setVisible(false);
		lable9.setVisible(false);
		lable10.setVisible(false);
		lable11.setVisible(false);
		lable12.setVisible(false);
		lable13.setVisible(false);
		lable14.setVisible(false);
	}
	
	public void clearForLabel9() {
		lable1.setVisible(false);
		lable2.setVisible(false);
		lable3.setVisible(false);
		lable4.setVisible(false);
		lable5.setVisible(false);
		lable6.setVisible(false);
		lable7.setVisible(false);
		lable8.setVisible(false);
		lable10.setVisible(false);
		lable11.setVisible(false);
		lable12.setVisible(false);
		lable13.setVisible(false);
		lable14.setVisible(false);
	}
	
	public void clearForLabel10() {
		lable1.setVisible(false);
		lable2.setVisible(false);
		lable3.setVisible(false);
		lable4.setVisible(false);
		lable5.setVisible(false);
		lable6.setVisible(false);
		lable7.setVisible(false);
		lable8.setVisible(false);
		lable9.setVisible(false);
		lable11.setVisible(false);
		lable12.setVisible(false);
		lable13.setVisible(false);
		lable14.setVisible(false);
	}
	
	public void clearForLabel11() {
		lable1.setVisible(false);
		lable2.setVisible(false);
		lable3.setVisible(false);
		lable4.setVisible(false);
		lable5.setVisible(false);
		lable6.setVisible(false);
		lable7.setVisible(false);
		lable8.setVisible(false);
		lable9.setVisible(false);
		lable10.setVisible(false);
		lable12.setVisible(false);
		lable13.setVisible(false);
		lable14.setVisible(false);
	}
	
	public void clearForLabel12() {
		lable1.setVisible(false);
		lable2.setVisible(false);
		lable3.setVisible(false);
		lable4.setVisible(false);
		lable5.setVisible(false);
		lable6.setVisible(false);
		lable7.setVisible(false);
		lable8.setVisible(false);
		lable9.setVisible(false);
		lable10.setVisible(false);
		lable11.setVisible(false);
		lable13.setVisible(false);
		lable14.setVisible(false);
	}
	
	public void clearForLabel13() {
		lable1.setVisible(false);
		lable2.setVisible(false);
		lable3.setVisible(false);
		lable4.setVisible(false);
		lable5.setVisible(false);
		lable6.setVisible(false);
		lable7.setVisible(false);
		lable8.setVisible(false);
		lable9.setVisible(false);
		lable10.setVisible(false);
		lable11.setVisible(false);
		lable12.setVisible(false);
		lable14.setVisible(false);
	}
	
	public void clearForLabel14() {
		lable1.setVisible(false);
		lable2.setVisible(false);
		lable3.setVisible(false);
		lable4.setVisible(false);
		lable5.setVisible(false);
		lable6.setVisible(false);
		lable7.setVisible(false);
		lable8.setVisible(false);
		lable9.setVisible(false);
		lable10.setVisible(false);
		lable11.setVisible(false);
		lable12.setVisible(false);
		lable13.setVisible(false);
	}
	
}
