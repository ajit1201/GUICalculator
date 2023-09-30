import javax.swing.*;
import java.awt.event.*;

public class Main{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculator");

        //num1 and num2 labels 
		JLabel Lnum1 = new JLabel("Num1 ");
		JLabel Lnum2 = new JLabel("Num2 ");

        //Result will be shown in this lable
		JLabel result = new JLabel();

        //TextField to take input values
		JTextField tFieldEquation1 = new JTextField();
		JTextField tFieldEquation2 = new JTextField();
		// JLabel LabResult = new JLabel("Result");
        //various operation buttons
		JButton btnSum, btnSub, btnMul, btnDiv;

		btnSum = new JButton("ADD");
		btnSub = new JButton("SUB");
		btnDiv = new JButton("DIV");
		btnMul = new JButton("MUL");

		btnSum.setBounds(100, 150, 60, 30);
		btnSub.setBounds(160, 150, 60, 30);
		btnDiv.setBounds(220, 150, 60, 30);
		btnMul.setBounds(280, 150, 60, 30);
		result.setBounds(100, 200, 240, 30);

		Lnum1.setBounds(30, 50, 60, 30);
		Lnum2.setBounds(30, 100, 60, 30);
		tFieldEquation1.setBounds(100, 50, 240, 30);
		tFieldEquation2.setBounds(100, 100, 240, 30);

		frame.add(btnSum);
		frame.add(btnSub);
		frame.add(btnMul);
		frame.add(btnDiv);
		frame.add(Lnum1);
		frame.add(Lnum2);
		frame.add(tFieldEquation1);
		frame.add(tFieldEquation2);
		frame.add(result);

		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					float x = Integer.parseInt(tFieldEquation1.getText());
					float y = Integer.parseInt(tFieldEquation2.getText());
					result.setText("Result is " + (x + y));
				} catch (Exception t) {
					// TODO: handle exception
					result.setText("Error!! plase check the value.");
				}
			}
		});

		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					float x = Integer.parseInt(tFieldEquation1.getText());
					float y = Integer.parseInt(tFieldEquation2.getText());
					result.setText("Result is " + (x - y));
				} catch (Exception t) {
					// TODO: handle exception
					result.setText("Error!! plase check the value.");
				}
			}
		});

		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					float x = Float.parseFloat(tFieldEquation1.getText());
					float y = Float.parseFloat(tFieldEquation2.getText());
					result.setText("Result is " + (x * y));
				} catch (Exception t) {
					// TODO: handle exception
					result.setText("Error!! plase check the value.");
				}
			}
		});

		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					float x = Float.parseFloat(tFieldEquation1.getText());
					float y = Float.parseFloat(tFieldEquation2.getText());
					result.setText("Result is " + (x / y));
				} catch (Exception t) {
					result.setText("Error!! plase check the value.");
				}

			}
		});
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
