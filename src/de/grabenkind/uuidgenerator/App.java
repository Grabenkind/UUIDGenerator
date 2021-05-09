package de.grabenkind.uuidgenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.UUID;

public class App {
	private JButton button1;
	private JPanel panel1;
	private JTextPane textPane1;

	public App() {

		textPane1.setContentType("text/html");
		textPane1.setEditable(false);
		textPane1.setBackground(null);
		textPane1.setBorder(null);
		textPane1.putClientProperty(JEditorPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
		textPane1.setFont(new Font("", Font.BOLD, 18));
		textPane1.setText(UUID.randomUUID().toString());

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textPane1.setText(UUID.randomUUID().toString());
			}
		});
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("UUID Generator");
		frame.setContentPane(new App().panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(480,270);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
