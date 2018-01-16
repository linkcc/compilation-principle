package ui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MiniCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWindow win = new MyWindow();
		
	}
}

class MyWindow extends Frame implements ActionListener {
	String s , str[] = new String[7];
	File f = new File("E:\\", "English.txt");
	FileReader inOne;
	BufferedReader inTwo;
	JButton btn_ans, btn_next, btn_new;
	JCheckBox checkbox[];
	JTextField test, result;
	JLabel Label, Label2;
	ButtonGroup sele = new ButtonGroup();
	
	int score = 0;
	JFrame frame;

	MyWindow() {
		frame = new JFrame("英语测试");
//		frame.setBackground(Color.MAGENTA);
//		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btn_next = new JButton("下一题");
		btn_next.setBounds(38, 197, 93, 23);
		frame.getContentPane().add(btn_next);
		btn_next.addActionListener(this);

		btn_ans = new JButton("结果");
		btn_ans.setBounds(166, 197, 93, 23);
		frame.getContentPane().add(btn_ans);
		btn_ans.addActionListener(this);
		 
	    btn_new = new JButton("重做一遍");
		btn_new.setBounds(294, 197, 93, 23);
		frame.getContentPane().add(btn_new);
		btn_new.addActionListener(this);

		
		result = new JTextField();
		result.setBounds(351, 22, 66, 21);
		frame.getContentPane().add(result);
		result.setColumns(10);
		result.setEditable(false);
		result.setFocusable(false);

		Label = new JLabel("分数：");
		Label.setHorizontalAlignment(SwingConstants.CENTER);
		Label.setBounds(290, 24, 54, 15);
		frame.getContentPane().add(Label);

		Label2 = new JLabel("题干：");
		Label2.setBounds(10, 22, 54, 15);
		frame.getContentPane().add(Label2);

		test = new JTextField();
		test.setBounds(0, 47, 434, 29);
		frame.getContentPane().add(test);
		test.setColumns(40);
		test.setEditable(false);
		test.setFocusable(false);

		checkbox = new JCheckBox[4];
		
		for (int i = 0; i <= 3; i++) {
			checkbox[i] = new JCheckBox("New check box");
			sele.add(checkbox[i]);
		}
		checkbox[0].setBounds(61, 100, 103, 23);
	
		checkbox[1].setBounds(61, 151, 103, 23);
	
		checkbox[2].setBounds(224, 100, 103, 23);
	
		checkbox[3].setBounds(224, 151, 103, 23);
		for (int i = 0; i <= 3; i++) {
			frame.getContentPane().add(checkbox[i]);
		}
		
		frame.setVisible(true);

		try {
			inOne = new FileReader(f);
			inTwo = new BufferedReader(inOne);
		} catch (IOException e) {
		}

		getText();
	}

	public void getText() {

		try {
			 s = inTwo.readLine();
			if (!s.contains("endend")) {
				
//				String regex = "#";
				
			    str = s.split("#");
			    
//				for(int i = 0; i < str.length; i++){
//			
//				}
//				char[] ch = new char[s.length()];
//				s.getChars(0, s.length(), ch, 0);
//				int cnt = 0, pos = 0;

//				for (int i = 0; i < s.length(); i++) {
//
//					if (ch[i] == '#') {
//						str[cnt++] = s.substring(pos, i);
//						pos = i + 1;
//					}
//				}
//				str[cnt++] = s.substring(pos, s.length());

				test.setText(str[0]);
				for (int j = 1; j <= 4; j++) {
					checkbox[j - 1].setText(str[j]);
				}
			} else {
				test.setText("学习完毕");
				for (int j = 0; j < 4; j++) {
					checkbox[j].setText("end");
					inTwo.close();
					inOne.close();
				}
			}

		} catch (IOException e) {
			test.setText("文件不存在");
		}
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btn_new) {
			score = 0;
			result.setText(s.valueOf(score));
			try {
				inOne = new FileReader(f);
				inTwo = new BufferedReader(inOne);
			} catch (IOException e) {

			}
			for (int j = 0; j < 4; j++) {
				checkbox[j].setEnabled(true);
			}
			btn_ans.setEnabled(true);
			getText();
		}

		if (event.getSource() == btn_next) {
			// 读下一题
			getText();
			for (int j = 0; j < 4; j++) {
				checkbox[j].setEnabled(true);
			}
			btn_ans.setEnabled(true);
		}
		
		if (event.getSource() == btn_ans) {
			for (int j = 0; j < 4; j++) {
				if (checkbox[j].getText().equals(str[5]) && checkbox[j].isSelected()) {
					score++;
					result.setText(s.valueOf(score));
				}
				checkbox[j].setEnabled(false);
			}
			btn_ans.setEnabled(false);
		}
	}
}