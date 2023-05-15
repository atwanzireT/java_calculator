
package caluculator;

import java.awt.Color;
/**
 *
 * @author Mugerwa
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class CALUCULATOR {

	private JFrame frmCALUCULATOR;
	private JTextField num1_txt, num2_txt, num3_txt, ansField;
	private JLabel label1, label2, label3, ansLabel;
	double fnumber;
	double snumber;
	double tnumber;
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

	private static void confirmExit(JFrame frame) {
        int confirmed = JOptionPane.showConfirmDialog(frame,
                "Are you sure you want to exit?", "Exit Confirmation",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            frame.dispose();
            System.exit(0);
        }
    }

	private void create() {
		frmCALUCULATOR = new JFrame();
		frmCALUCULATOR.setTitle("Calculator");
		frmCALUCULATOR.setBounds(100, 100, 300, 300);
		frmCALUCULATOR.setResizable(false);
		frmCALUCULATOR.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmCALUCULATOR.getContentPane().setLayout(null);
		frmCALUCULATOR.getContentPane().setBackground(Color.LIGHT_GRAY);

		frmCALUCULATOR.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                confirmExit(frmCALUCULATOR);
            }
        });

        JLabel label = new JLabel("Click the close button to exit.");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frmCALUCULATOR.getContentPane().add(label);


		num1_txt = new JTextField();
		num2_txt = new JTextField();
		num3_txt = new JTextField();
		ansField = new JTextField();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		ansLabel = new JLabel();

		label1.setText("Num 1");
		label1.setLabelFor(num1_txt);
		label1.setBounds(20, 0, 80, 40);
		frmCALUCULATOR.getContentPane().add(label1);

		label2.setText("Num 2");
		label2.setLabelFor(num2_txt);
		label2.setBounds(110, 0, 80, 40);
		frmCALUCULATOR.getContentPane().add(label2);

		label3.setText("Num 3");
		label3.setLabelFor(num3_txt);
		label3.setBounds(200, 0, 80, 40);
		frmCALUCULATOR.getContentPane().add(label3);

		ansLabel.setText("Ans");
		ansLabel.setLabelFor(num1_txt);
		ansLabel.setBounds(20, 100, 80, 40);
		frmCALUCULATOR.getContentPane().add(ansLabel);

		num1_txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		num1_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		num1_txt.setBounds(20, 35, 80, 40);
		frmCALUCULATOR.getContentPane().add(num1_txt);
		num1_txt.setColumns(5);

		num2_txt = new JTextField();
		num2_txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		num2_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		num2_txt.setBounds(110, 35, 80, 40);
		frmCALUCULATOR.getContentPane().add(num2_txt);
		num3_txt.setColumns(5);

		num3_txt = new JTextField();
		num3_txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		num3_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		num3_txt.setBounds(200, 35, 80, 40);
		frmCALUCULATOR.getContentPane().add(num3_txt);
		num3_txt.setColumns(5);

		ansField = new JTextField();
		ansField.setFont(new Font("Tahoma", Font.BOLD, 20));
		ansField.setHorizontalAlignment(SwingConstants.RIGHT);
		ansField.setBounds(80, 100, 200, 40);
		frmCALUCULATOR.getContentPane().add(ansField);
		num3_txt.setColumns(5);

		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnumber = Double.parseDouble(num1_txt.getText());
				snumber = Double.parseDouble(num2_txt.getText());
				tnumber = Double.parseDouble(num3_txt.getText());
				answer = fnumber * snumber * tnumber;
				ans = String.format("%.2f", answer);
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnMul.setBounds(26, 150, 68, 39);
		btnMul.setBackground(Color.YELLOW);
		frmCALUCULATOR.getContentPane().add(btnMul);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnumber = Double.parseDouble(num1_txt.getText());
				snumber = Double.parseDouble(num2_txt.getText());
				tnumber = Double.parseDouble(num3_txt.getText());
				answer = fnumber - snumber - tnumber;
				ans = String.format("%.2f", answer);
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSub.setBounds(115, 150, 68, 39);
		btnSub.setBackground(Color.MAGENTA);
		frmCALUCULATOR.getContentPane().add(btnSub);

		// The answer button
		JButton btnEqu = new JButton("CALCULATE");
		btnEqu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ansField.setText(ans);
				num1_txt.setText("");
				num2_txt.setText("");
				num3_txt.setText("");
			}
		});
		btnEqu.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnEqu.setBounds(26, 200, 250, 39);
		btnEqu.setBackground(Color.GREEN);
		frmCALUCULATOR.getContentPane().add(btnEqu);

		

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnumber = Double.parseDouble(num1_txt.getText());
				snumber = Double.parseDouble(num2_txt.getText());
				tnumber = Double.parseDouble(num3_txt.getText());
				answer = fnumber + snumber + tnumber;
				ans = String.format("%.2f", answer);
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPlus.setBounds(210, 150, 68, 39);
		btnPlus.setBackground(Color.BLUE);
		frmCALUCULATOR.getContentPane().add(btnPlus);
	}

}
