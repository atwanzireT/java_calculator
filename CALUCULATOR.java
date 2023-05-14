
package caluculator;

import java.awt.Color;
/**
 *
 * @author Mugerwa
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class CALUCULATOR {

	private JFrame frmCALUCULATOR;
	private JTextField txtShow;
	double fnumber;
	double snumber;
	double answer;
	String operand;
	String ans;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CALUCULATOR window = new CALUCULATOR();
					window.frmCALUCULATOR.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public CALUCULATOR() {
		create();
	}

	private void create() {
		frmCALUCULATOR = new JFrame();
		frmCALUCULATOR.setTitle("Calculator");
		frmCALUCULATOR.setBounds(100, 100, 300, 300);
		frmCALUCULATOR.setResizable(false);
		frmCALUCULATOR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCALUCULATOR.getContentPane().setLayout(null);
		frmCALUCULATOR.getContentPane().setBackground(Color.darkGray);

		txtShow = new JTextField();
		txtShow.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtShow.setHorizontalAlignment(SwingConstants.RIGHT);
		txtShow.setBounds(26, 21, 250, 64);
		frmCALUCULATOR.getContentPane().add(txtShow);
		txtShow.setColumns(10);

		
		JButton btnSq = new JButton("√");
		btnSq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt;
				double ttxt;
				fnumber = Double.parseDouble(txtShow.getText());
				ttxt = Math.sqrt(fnumber);
				txt = String.format("%.4f", ttxt);
				txtShow.setText(txt);

			}
		});
		btnSq.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSq.setBounds(26, 100, 68, 39);
		btnSq.setBackground(Color.WHITE);
		frmCALUCULATOR.getContentPane().add(btnSq);

		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnumber = Double.parseDouble(txtShow.getText());
				txtShow.setText("");
				operand = "/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndiv.setBounds(115, 100, 68, 39);
		btndiv.setBackground(Color.WHITE);
		frmCALUCULATOR.getContentPane().add(btndiv);

		JButton btnPer = new JButton("%");
		btnPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnumber = Double.parseDouble(txtShow.getText());
				txtShow.setText("");
				operand = "%";

			}
		});
		btnPer.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPer.setBounds(210, 100, 68, 39);
		btnPer.setBackground(Color.WHITE);
		frmCALUCULATOR.getContentPane().add(btnPer);

		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnumber = Double.parseDouble(txtShow.getText());
				txtShow.setText("");
				operand = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBounds(26, 150, 68, 39);
		btnMul.setBackground(Color.WHITE);
		frmCALUCULATOR.getContentPane().add(btnMul);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnumber = Double.parseDouble(txtShow.getText());
				txtShow.setText("");
				operand = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(115, 150, 68, 39);
		btnSub.setBackground(Color.WHITE);
		frmCALUCULATOR.getContentPane().add(btnSub);

		// The answer button
		JButton btnEqu = new JButton("=");
		btnEqu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				snumber = Double.parseDouble(txtShow.getText());
				if (operand == "+") {
					answer = fnumber + snumber;
					ans = String.format("%.2f", answer);
					txtShow.setText(ans);
				} else if (operand == "-") {
					answer = fnumber - snumber;
					ans = String.format("%.2f", answer);
					txtShow.setText(ans);
				} else if (operand == "*") {
					answer = fnumber * snumber;
					ans = String.format("%.2f", answer);
					txtShow.setText(ans);
				} else if (operand == "/") {
					answer = fnumber / snumber;
					ans = String.format("%.2f", answer);
					txtShow.setText(ans);
				} else if (operand == "%") {
					answer = fnumber % snumber;
					ans = String.format("%.2f", answer);
					txtShow.setText(ans);
				} else {
					txtShow.setText("Syntax Error");
				}
			}
		});
		btnEqu.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqu.setBounds(26, 200, 250, 39);
		btnEqu.setBackground(Color.WHITE);
		frmCALUCULATOR.getContentPane().add(btnEqu);

		

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnumber = Double.parseDouble(txtShow.getText());
				txtShow.setText("");
				operand = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(210, 150, 68, 39);
		btnPlus.setBackground(Color.WHITE);
		frmCALUCULATOR.getContentPane().add(btnPlus);
	}

}
