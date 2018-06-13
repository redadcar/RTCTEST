package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.KeyStroke;


import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private double firstNumber;
	private double secondNumber;
	private String operation;
	private int result = 0;
	private double cont = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.dasddassadasdada
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 423, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(cont == 0) {
					String text = textField.getText() + btn7.getText();
					textField.setText(text);	
					firstNumber = Integer.valueOf(btn7.getText());
				}else {
					String text = textField.getText()+operation + btn7.getText();
					textField.setText(text);	
					secondNumber = Integer.valueOf(btn7.getText());
				}							
			}
		});
		btn7.setBounds(15, 82, 82, 66);
		frame.getContentPane().add(btn7);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setBounds(15, 16, 381, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(cont == 0) {
					String text = textField.getText() + btn8.getText();
					textField.setText(text);	
					firstNumber = Integer.valueOf(btn8.getText());
				}else {
					String text = textField.getText()+operation + btn8.getText();
					textField.setText(text);	
					secondNumber = Integer.valueOf(btn8.getText());
				}						
			}
		});
		btn8.setBounds(112, 82, 82, 66);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(cont == 0) {
					String text = textField.getText() + btn9.getText();
					textField.setText(text);	
					firstNumber = Integer.valueOf(btn9.getText());
				}else {
					String text = textField.getText()+operation + btn9.getText();
					textField.setText(text);	
					secondNumber = Integer.valueOf(btn9.getText());
				}							
			}
		});
		btn9.setBounds(217, 82, 82, 66);
		frame.getContentPane().add(btn9);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(cont == 0) {
					String text = textField.getText() + btn1.getText();
					textField.setText(text);	
					firstNumber = Integer.valueOf(btn1.getText());
				}else {
					String text = textField.getText()+operation + btn1.getText();
					textField.setText(text);	
					secondNumber = Integer.valueOf(btn1.getText());
				}						
			}
		});
		btn1.setBounds(15, 246, 82, 66);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(cont == 0) {
					String text = textField.getText() + btn2.getText();
					textField.setText(text);	
					firstNumber = Integer.valueOf(btn2.getText());
				}else {
					String text = textField.getText()+operation + btn2.getText();
					textField.setText(text);	
					secondNumber = Integer.valueOf(btn2.getText());
				}					
			}
		});
		btn2.setBounds(112, 246, 82, 66);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(cont == 0) {
					String text = textField.getText() + btn3.getText();
					textField.setText(text);	
					firstNumber = Integer.valueOf(btn3.getText());
				}else {
					String text = textField.getText()+operation + btn3.getText();
					textField.setText(text);	
					secondNumber = Integer.valueOf(btn3.getText());
				}							
			}
		});
		btn3.setBounds(217, 246, 82, 66);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(cont == 0) {
					String text = textField.getText() + btn4.getText();
					textField.setText(text);	
					firstNumber = Integer.valueOf(btn4.getText());
				}else {
					String text = textField.getText()+operation + btn4.getText();
					textField.setText(text);	
					secondNumber = Integer.valueOf(btn4.getText());
				}							
			}
		});
		
		btn4.setBounds(15, 164, 82, 66);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(cont == 0) {
					String text = textField.getText() + btn5.getText();
					textField.setText(text);	
					firstNumber = Integer.valueOf(btn5.getText());
				}else {
					String text = textField.getText()+operation + btn5.getText();
					textField.setText(text);	
					secondNumber = Integer.valueOf(btn5.getText());
				}							
			}
		});
		btn5.setBounds(112, 164, 82, 66);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");

		Action action=new AbstractAction("doSomething") {

		    @Override
		    public void actionPerformed(ActionEvent e) {

				if(cont == 0) {
					String text = textField.getText() + btn6.getText();
					textField.setText(text);	
					firstNumber = Integer.valueOf(btn6.getText());
				}else {
					String text = textField.getText() +operation+ btn6.getText();
					textField.setText(text);	
					secondNumber = Integer.valueOf(btn6.getText());
				}									    }

		};
		action.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("6"));
		btn6.getActionMap().put("myAction", action);
		btn6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
		   (KeyStroke) action.getValue(Action.ACCELERATOR_KEY), "myAction");
		btn6.setBounds(217, 164, 82, 66);
		frame.getContentPane().add(btn6);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				if(cont == 0) {
					String text = textField.getText() + btn0.getText();
					textField.setText(text);	
					firstNumber = Integer.valueOf(btn0.getText());
				}else {
					String text = textField.getText()+operation+ btn0.getText();
					textField.setText(text);	
					secondNumber = Integer.valueOf(btn0.getText());
				}				
			}
		});
		btn0.setBounds(15, 328, 82, 66);
		frame.getContentPane().add(btn0);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont++;
				operation = "+";
								
			}
		});
		btnPlus.setBounds(314, 82, 82, 66);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont++;
				operation = "-";

				
			}
		});
		btnMinus.setBounds(314, 164, 82, 66);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont++;
				operation = "*";
			}
		});
		btnMult.setBounds(314, 246, 82, 66);
		frame.getContentPane().add(btnMult);
		
		JButton btnDec = new JButton(".");
		btnDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDec.setBounds(112, 328, 82, 66);
		frame.getContentPane().add(btnDec);
		
		JButton btnDelete = new JButton("C");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont = 0;
				textField.setText("");
				firstNumber = 0;
				secondNumber = 0;
			}
		});
		btnDelete.setBounds(217, 328, 82, 66);
		frame.getContentPane().add(btnDelete);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {						
				/**
				 * operação X
				 */
				//result = metodo de cálculo
			try {
				if(operation == "+") {
					result = (int)(firstNumber + secondNumber);
				}else if(operation=="-") {
					result=Operations.subtract((int)firstNumber, (int)secondNumber);
				}else if(operation=="*") {
					result=Operations.multiplication((int)firstNumber,(int)secondNumber);
				}else if(operation=="/") {
					
						result=Operations.divide((int)firstNumber, (int)secondNumber);
					
				}
				
				//ValueOf para números inteiros
				textField.setText(String.valueOf(result));
				firstNumber = result;			
			} catch (Exception e1) {
						textField.setText("Syntax Error");
					}
			}
		});
		btnEqual.setBounds(314, 328, 82, 66);
		frame.getContentPane().add(btnEqual);
	}
}
