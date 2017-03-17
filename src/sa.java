import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class sa {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sa window = new sa();
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
	public sa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		second sc = new second();
		String[] actionBt = new String[1];
		boolean[] eqPressed ={false}; 
		final double[] value = new double[2];
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 187, 268);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setBounds(6, 6, 175, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(52, 44, 80, 16);
		frame.getContentPane().add(label);		
		
		JButton button = new JButton("0");
		button.setBounds(52, 211, 34, 29);
		frame.getContentPane().add(button);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(eqPressed[0] == true){
					textField.setText("");
					textField.setText(textField.getText() + "0");
					label.setText(label.getText() + " 0");
					eqPressed[0] = false;
				}else{
					textField.setText(textField.getText() + "0");
					label.setText(label.getText() + " 0");
				}					
			}
		});
		
		
		
		JButton button_3 = new JButton("1");
		button_3.setBounds(6, 170, 34, 29);
		frame.getContentPane().add(button_3);
		
		button_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(eqPressed[0] == true){
					textField.setText("");
					textField.setText(textField.getText() + "1");
					label.setText(label.getText() + "1");
					eqPressed[0] = false;
				}else{
					textField.setText(textField.getText() + "1");
					label.setText(label.getText() + "1");
				}
			}
		});
		
		JButton button_4 = new JButton("2");
		button_4.setBounds(52, 170, 34, 29);
		frame.getContentPane().add(button_4);
		
		button_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(eqPressed[0] == true){
					textField.setText("");
					textField.setText(textField.getText() + "2");
					label.setText(label.getText() + "2");
					eqPressed[0] = false;
				}else{
					textField.setText(textField.getText() + "2");
					label.setText(label.getText() + "2");
				}
			}
		});
		
		JButton button_5 = new JButton("3");
		button_5.setBounds(98, 170, 34, 29);
		frame.getContentPane().add(button_5);
		
		button_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(eqPressed[0] == true){
					textField.setText("");
					textField.setText(textField.getText() + "3");
					label.setText(label.getText() + "3");
					eqPressed[0] = false;
				}else{
					textField.setText(textField.getText() + "3");
					label.setText(label.getText() + "3");
				}
			}
		});
		
		JButton button_7 = new JButton("4");
		button_7.setBounds(6, 129, 34, 29);
		frame.getContentPane().add(button_7);
		
		button_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(eqPressed[0] == true){
					textField.setText("");
					textField.setText(textField.getText() + "4");
					label.setText(label.getText() + "4");
					eqPressed[0] = false;
				}else{
					textField.setText(textField.getText() + "4");
					label.setText(label.getText() + "4");
				}
			}
		});
		
		JButton button_8 = new JButton("5");
		button_8.setBounds(52, 129, 34, 29);
		frame.getContentPane().add(button_8);
		
		button_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(eqPressed[0] == true){
					textField.setText("");
					textField.setText(textField.getText() + "5");
					label.setText(label.getText() + "5");
					eqPressed[0] = false;
				}else{
					textField.setText(textField.getText() + "5");
					label.setText(label.getText() + "5");
				}
			}
		});
		
		JButton button_9 = new JButton("6");
		button_9.setBounds(98, 129, 34, 29);
		frame.getContentPane().add(button_9);
		
		button_9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(eqPressed[0] == true){
					textField.setText("");
					textField.setText(textField.getText() + "6");
					label.setText(label.getText() + "6");
					eqPressed[0] = false;
				}else{
					textField.setText(textField.getText() + "6");
					label.setText(label.getText() + "6");
				}
			}
		});
		
		JButton button_10 = new JButton("7");
		button_10.setBounds(6, 88, 34, 29);
		frame.getContentPane().add(button_10);
		
		button_10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(eqPressed[0] == true){
					textField.setText("");
					textField.setText(textField.getText() + "7");
					label.setText(label.getText() + "7");
					eqPressed[0] = false;
				}else{
					textField.setText(textField.getText() + "7");
					label.setText(label.getText() + "7");
				}
			}
		});
		
		JButton button_11 = new JButton("8");
		button_11.setBounds(52, 88, 34, 29);
		frame.getContentPane().add(button_11);
		
		button_11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(eqPressed[0] == true){
					textField.setText("");
					textField.setText(textField.getText() + "8");
					label.setText(label.getText() + "8");
					eqPressed[0] = false;
				}else{
					textField.setText(textField.getText() + "8");
					label.setText(label.getText() + "8");
				}
			}
		});
		
		JButton button_12 = new JButton("9");
		button_12.setBounds(98, 88, 34, 29);
		frame.getContentPane().add(button_12);
				
		button_12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(eqPressed[0] == true){
					//textField.setText(null);
					textField.setText(textField.getText() + "9");
					label.setText(label.getText() + "9");
					eqPressed[0] = false;
				}else{
					textField.setText(textField.getText() + "9");
					label.setText(label.getText() + "9");
				}
			}
		});
		
		JButton button_13 = new JButton(",");
		button_13.setBounds(6, 211, 34, 29);
		frame.getContentPane().add(button_13);
		
		button_13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(eqPressed[0] == true){
					textField.setText("");
					textField.setText(textField.getText() + ".");
					label.setText(label.getText() + ".");
					eqPressed[0] = false;
				}else{
					textField.setText(textField.getText() + ".");
					label.setText(label.getText() + ".");
				}
			}
		});
		
		JButton button_14 = new JButton("=");
		button_14.setBounds(98, 211, 34, 29);
		frame.getContentPane().add(button_14);
		
		button_14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				eqPressed[0] = true;
				String u = textField.getText();
				value[1] = Double.parseDouble(u);
				
				if(actionBt[0].equals("+")){
					double sum = sc.sum(value[0], value[1]);
					value[0] = sum;
					String txt = String.valueOf(sum);
					textField.setText(txt);
					label.setText("= " + txt);
				}
				if(actionBt[0].equals("-")){
					double min = sc.min(value[0], value[1]);			
					String txt = String.valueOf(min);
					value[0] = min;
					textField.setText(txt);
					label.setText("= " + txt);
				}
				if(actionBt[0].equals("*")){
					double mul = sc.mul(value[0], value[1]);			
					String txt = String.valueOf(mul);
					value[0] = mul;
					textField.setText(txt);
					label.setText("= " + txt);
				}
				if(actionBt[0].equals("/")){
					double div = sc.div(value[0], value[1]);			
					String txt = String.valueOf(div);
					value[0] = div;
					textField.setText(txt);
					label.setText("= " + txt);
				}
			}
		});
		
		JButton button_6 = new JButton("+");
		button_6.setBounds(147, 88, 34, 29);
		frame.getContentPane().add(button_6);
		
		button_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String u = textField.getText();
				value[0] = Double.parseDouble(u);
				textField.setText("");
				label.setText(u + " + ");
				actionBt[0] = "+";
					
			}
		});
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.setBounds(147, 129, 34, 29);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String u = textField.getText();
				value[0] = Double.parseDouble(u);
				textField.setText("");
				label.setText(u + " - ");
				actionBt[0] = "-";
				
			}
		});
				
		JButton btnX = new JButton("X");
		btnX.setBounds(147, 170, 34, 29);
		frame.getContentPane().add(btnX);
		
		btnX.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String u = textField.getText();
				value[0] = Double.parseDouble(u);
				textField.setText("");
				label.setText(u + " x ");
				actionBt[0] = "*";
				
			}
		});
		
		JButton button_2 = new JButton("/");
		button_2.setBounds(147, 211, 34, 29);
		frame.getContentPane().add(button_2);
		
		button_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String u = textField.getText();
				value[0] = Double.parseDouble(u);
				textField.setText("");
				label.setText(u + " / ");
				actionBt[0] = "/";
				
			}
		});
		
		JButton button_1 = new JButton("C");
		button_1.setBounds(6, 47, 34, 29);
		frame.getContentPane().add(button_1);
		
		button_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				value[0] = 0;
				value[1] = 0;
				textField.setText("");
				label.setText("");
				eqPressed[0] = false;
				
				
			}
		});
		
		JButton button_15 = new JButton("<-");
		button_15.setBounds(147, 47, 34, 29);
		frame.getContentPane().add(button_15);
		
		button_15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				textField.setText( textField.getText().substring(0, textField.getText().length()-1));
				
				
			}
		});
		
		
	}
}
