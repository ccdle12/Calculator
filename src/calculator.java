import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class calculator {

	private JFrame frame;
	private JTextField textDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setBounds(100, 100, 252, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setBounds(10, 11, 215, 33);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		
		//Numbers Buttons
		//-------- 9 button ---------------//
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn_9.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_9.setBounds(122, 110, 50, 50);
		frame.getContentPane().add(btn_9);
		//-------- 9 button ---------------//
		
		
		//-------- 8 button ---------------//
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn_8.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_8.setBounds(66, 110, 50, 50);
		frame.getContentPane().add(btn_8);
		//-------- 8 button ---------------//
				
		
		//-------- 7 button ---------------//
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn_7.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_7.setBounds(10, 110, 50, 50);
		frame.getContentPane().add(btn_7);
		//-------- 7 button ---------------//
		
		
		//-------- 6 button ---------------//
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn_6.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_6.setBounds(122, 165, 50, 50);
		frame.getContentPane().add(btn_6);
		//-------- 6 button ---------------//
		
		
		//-------- 5 button ---------------//
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn_5.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_5.setBounds(66, 165, 50, 50);
		frame.getContentPane().add(btn_5);
		//-------- 5 button ---------------//
		
		
		//-------- 4 button ---------------//
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn_4.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_4.setBounds(10, 165, 50, 50);
		frame.getContentPane().add(btn_4);
		//-------- 4 button ---------------//
		
		
		//-------- 3 button ---------------//
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn_3.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_3.setBounds(122, 220, 50, 50);
		frame.getContentPane().add(btn_3);
		//-------- 3 button ---------------//
		
		
		//-------- 2 button ---------------//
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn_2.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_2.setBounds(66, 220, 50, 50);
		frame.getContentPane().add(btn_2);
		//-------- 2 button ---------------//
				
		
		//-------- 1 button ---------------//
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn_1.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_1.setBounds(10, 220, 50, 50);
		frame.getContentPane().add(btn_1);
		//-------- 1 button ---------------//
		
		
		//-------- 0 button ---------------//
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn_0.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_0.setBounds(10, 281, 50, 50);
		frame.getContentPane().add(btn_0);
		//-------- 0 button ---------------//
		
		//-------- dot button ---------------//
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn_dot.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn_dot.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_dot.setBounds(66, 281, 50, 50);
		frame.getContentPane().add(btn_dot);
		//-------- dot button ---------------//
		
		//-------- +/- button ---------------//
		JButton btn_neg = new JButton("+/-");
		btn_neg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
			ops = ops * (-1);
			textDisplay.setText(String.valueOf(ops));
			
			}
		});
		btn_neg.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_neg.setBounds(10, 55, 50, 50);
		frame.getContentPane().add(btn_neg);
		//-------- +/- button ---------------//
		//End Numbers Buttons
		
		
		//Operations
		//-------- Plus button ---------------//
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			firstnum = Double.parseDouble(textDisplay.getText());
			textDisplay.setText(null);
			operations = "+";
			
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPlus.setBounds(175, 220, 50, 50);
		frame.getContentPane().add(btnPlus);
		//-------- Plus button ---------------//
		
		
		//-------- Sub button ---------------//
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText(null);
				operations = "-"; 
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSub.setBounds(175, 165, 50, 50);
		frame.getContentPane().add(btnSub);
		//-------- Sub button ---------------//
		
		
		//-------- Multiply button ---------------//
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText(null);
				operations = "*";
			}
		});
		btnMulti.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMulti.setBounds(175, 110, 50, 50);
		frame.getContentPane().add(btnMulti);
		//-------- Multiply button ---------------//
		
		
		//-------- Back Clear button ---------------//
		JButton btn_backClear = new JButton("BC");
		btn_backClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace=null;
				
				if(textDisplay.getText().length() > 0){
					StringBuilder strnum = new StringBuilder(textDisplay.getText());
					strnum.deleteCharAt(textDisplay.getText().length() - 1);
					backspace = strnum.toString();
					textDisplay.setText(backspace);
				}
			}
		});
		btn_backClear.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_backClear.setBounds(66, 55, 50, 50);
		frame.getContentPane().add(btn_backClear);
		//-------- Back Clear button ---------------//
		
		
		//-------- ALL Clear button ---------------//
		JButton btn_clear = new JButton("AC");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textDisplay.setText(null);
			}
		});
		btn_clear.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_clear.setBounds(122, 55, 50, 50);
		frame.getContentPane().add(btn_clear);
		//-------- Clear button ---------------//
		
		
		//-------- Equal button ---------------//
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				secondnum = Double.parseDouble(textDisplay.getText());
				if (operations == "+"){
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				
				if (operations == "-"){
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				if (operations == "/"){
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				if (operations == "*"){
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				
			}
		});
		btn_equal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_equal.setBounds(122, 281, 103, 50);
		frame.getContentPane().add(btn_equal);
		
		JButton btn_divide = new JButton("/");
		btn_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText(null);
				operations = "/";
			}
		});
		btn_divide.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_divide.setBounds(175, 55, 50, 50);
		frame.getContentPane().add(btn_divide);
		//-------- Equal button ---------------//
				
		//END Operations
		
			}
	}


