package de.grabenkind.uuidgenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.UUID;

public class App {
	private JButton button1;
	private JPanel panel1;
	private JTextPane textPane1;
	private JButton copyButton;

	String uuid;

	public App() {
		textPane1.setContentType("text/html");
		textPane1.setEditable(false);
		textPane1.setBackground(null);
		textPane1.setBorder(null);
		textPane1.putClientProperty(JEditorPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
		textPane1.setFont(new Font("", Font.BOLD, 18));
		uuid = UUID.randomUUID().toString();
		textPane1.setText(uuid);

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				uuid = UUID.randomUUID().toString();
				textPane1.setText(uuid);
			}
		});
		copyButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StringSelection stringSelection = new StringSelection(uuid);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
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
