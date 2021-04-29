package com.tyss.designpattern.factorymethod;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class WindowButton implements Button {
	
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JLabel lable = new JLabel();
	JButton button;


	@Override
	public void rendering() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  JLabel label = new JLabel("Hello World!"); 
		  label.setBackground(new Color(230,245,125)); 
		  label.setFont(new Font("Dialog", Font.BOLD, 44));
		  label.setHorizontalAlignment(SwingConstants.CENTER);
		  panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		  frame.getContentPane().add(panel); 
		  panel.add(label); 
		  clicking();
		  panel.add(button);
		  
		  frame.setSize(320,300); 
		  frame.setVisible(true);

	}

	@Override
	public void clicking() {
		 button=new JButton("Exit");
	     System.out.println("Exit button clicked");
	}

}
