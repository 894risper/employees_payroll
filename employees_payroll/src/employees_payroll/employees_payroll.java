package employees_payroll;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class employees_payroll {

	private JFrame frmGeorgetownCleaningServices;
	private JTextField employeeName;
	private JLabel lblNewLabel_1;
	private JTextField hourlySalary;
	private JPanel panel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField Fmonday;
	private JTextField Ftuesday;
	private JTextField Fwed;
	private JTextField Fthur;
	private JTextField Ffriday;
	private JTextField Fsunday;
	private JTextField Smonday;
	private JTextField Stuesday;
	private JTextField Swed;
	private JTextField Sthur;
	private JTextField Sfriday;
	private JTextField Fsaturday;
	private JTextField Ssaturday;
	private JTextField Ssunday;
	private JPanel panel_2;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JTextField regularHours;
	private JTextField overtimeHours;
	private JTextField regularAmount;
	private JTextField overtimeAmount;
	private JTextField netpay;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employees_payroll window = new employees_payroll();
					window.frmGeorgetownCleaningServices.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public employees_payroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeorgetownCleaningServices = new JFrame();
		frmGeorgetownCleaningServices.setAlwaysOnTop(true);
		frmGeorgetownCleaningServices.setForeground(new Color(0, 0, 0));
		frmGeorgetownCleaningServices.setBackground(new Color(0, 0, 0));
		frmGeorgetownCleaningServices.setFont(new Font("Dialog", Font.BOLD, 20));
		frmGeorgetownCleaningServices.setTitle("Georgetown Cleaning Services -Employee Payroll");
		frmGeorgetownCleaningServices.setBounds(100, 100, 928, 570);
		frmGeorgetownCleaningServices.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeorgetownCleaningServices.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Employee Identification", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 11, 896, 89);
		frmGeorgetownCleaningServices.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(24, 26, 130, 39);
		panel.add(lblNewLabel);
		
		employeeName = new JTextField();
		employeeName.setBounds(147, 37, 251, 20);
		panel.add(employeeName);
		employeeName.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Hourly Salary:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(423, 37, 139, 17);
		panel.add(lblNewLabel_1);
		
		hourlySalary = new JTextField();
		hourlySalary.setBounds(534, 37, 187, 20);
		panel.add(hourlySalary);
		hourlySalary.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Time Sheet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(0, 111, 896, 149);
		frmGeorgetownCleaningServices.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_2 = new JLabel("Thursday");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(482, 21, 87, 23);
		panel_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("First Week:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(0, 51, 88, 23);
		panel_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Monday");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(124, 21, 99, 23);
		panel_1.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Tuesday");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(222, 21, 110, 23);
		panel_1.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Wednesday");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(342, 21, 114, 23);
		panel_1.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Friday");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(604, 21, 78, 23);
		panel_1.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Saturday");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(707, 21, 67, 23);
		panel_1.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Sunday");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(819, 21, 67, 23);
		panel_1.add(lblNewLabel_9);
		
		Fmonday = new JTextField();
		Fmonday.setBounds(108, 54, 86, 20);
		panel_1.add(Fmonday);
		Fmonday.setColumns(10);
		
		Ftuesday = new JTextField();
		Ftuesday.setColumns(10);
		Ftuesday.setBounds(222, 54, 86, 20);
		panel_1.add(Ftuesday);
		
		Fwed = new JTextField();
		Fwed.setColumns(10);
		Fwed.setBounds(342, 54, 86, 20);
		panel_1.add(Fwed);
		
		Fthur = new JTextField();
		Fthur.setColumns(10);
		Fthur.setBounds(470, 55, 87, 20);
		panel_1.add(Fthur);
		
		Ffriday = new JTextField();
		Ffriday.setColumns(10);
		Ffriday.setBounds(589, 54, 87, 20);
		panel_1.add(Ffriday);
		
		Fsunday = new JTextField();
		Fsunday.setColumns(10);
		Fsunday.setBounds(803, 54, 83, 20);
		panel_1.add(Fsunday);
		
		Smonday = new JTextField();
		Smonday.setColumns(10);
		Smonday.setBounds(108, 85, 86, 20);
		panel_1.add(Smonday);
		
		Stuesday = new JTextField();
		Stuesday.setColumns(10);
		Stuesday.setBounds(222, 85, 86, 20);
		panel_1.add(Stuesday);
		
		Swed = new JTextField();
		Swed.setColumns(10);
		Swed.setBounds(342, 85, 86, 20);
		panel_1.add(Swed);
		
		Sthur = new JTextField();
		Sthur.setColumns(10);
		Sthur.setBounds(471, 86, 86, 20);
		panel_1.add(Sthur);
		
		Sfriday = new JTextField();
		Sfriday.setColumns(10);
		Sfriday.setBounds(589, 85, 86, 20);
		panel_1.add(Sfriday);
		
		Fsaturday = new JTextField();
		Fsaturday.setColumns(10);
		Fsaturday.setBounds(700, 54, 87, 20);
		panel_1.add(Fsaturday);
		
		Ssaturday = new JTextField();
		Ssaturday.setColumns(10);
		Ssaturday.setBounds(700, 85, 87, 20);
		panel_1.add(Ssaturday);
		
		Ssunday = new JTextField();
		Ssunday.setColumns(10);
		Ssunday.setBounds(800, 85, 86, 20);
		panel_1.add(Ssunday);
		
		JLabel lblNewLabel_15 = new JLabel("Second Week:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_15.setBounds(0, 85, 98, 14);
		panel_1.add(lblNewLabel_15);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Payroll Processing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(0, 282, 896, 169);
		frmGeorgetownCleaningServices.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Process it");
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            // Parse input values
		            double Salary = Double.parseDouble(hourlySalary.getText());
		            double[] week1 = {Double.parseDouble(Fmonday.getText()), Double.parseDouble(Ftuesday.getText()), Double.parseDouble(Fwed.getText()),
		                            Double.parseDouble(Fthur.getText()), Double.parseDouble(Ffriday.getText()), Double.parseDouble(Fsaturday.getText()), Double.parseDouble(Fsunday.getText())};
		            double[] week2 = {Double.parseDouble(Smonday.getText()), Double.parseDouble(Stuesday.getText()), Double.parseDouble(Swed.getText()),
		                            Double.parseDouble(Sthur.getText()), Double.parseDouble(Sfriday.getText()), Double.parseDouble(Ssaturday.getText()), Double.parseDouble(Ssunday.getText())};

		            // Calculate regular and overtime hours for each week
		            double week1overtime = 0;
		            double week2overtime = 0;
		            double week1RegularHours = 0;
		            double week2RegularHours = 0;

		            for (double hours : week1) {
		                if (hours <= 8) {
		                    week1RegularHours += hours;
		                } else {
		                    week1RegularHours += 8;
		                    week1overtime += hours - 8;
		                }
		            }

		            for (double hours : week2) {
		                if (hours <= 8) {
		                    week2RegularHours += hours;
		                } else {
		                    week2RegularHours += 8;
		                    week2overtime += hours - 8;
		                }
		            }

		            // Calculate total regular and overtime hours
		            double totalRegularHours = week1RegularHours + week2RegularHours;
		            double totalOvertime = week1overtime + week2overtime;

		            // Calculate amounts
		            double regularAmountValue = totalRegularHours * Salary;
		            double overtimeAmountValue = totalOvertime * (Salary * 1.5);
		            String formattedOvertimeAmount = String.format("%.2f", overtimeAmountValue);
		            // Calculate net pay
		            double netPay = regularAmountValue + overtimeAmountValue;

		            // Update text fields
		            regularHours.setText(Double.toString(totalRegularHours));
		            overtimeHours.setText(Double.toString(totalOvertime));
		            regularAmount.setText(Double.toString(regularAmountValue));
		            overtimeAmount.setText(Double.toString(overtimeAmountValue));
		            netpay.setText(Double.toString(netPay));

		        } catch (NumberFormatException ex) {
		            // Handle the case where parsing fails (non-numeric input)
		            // You might want to display an error message or log the issue
		            ex.printStackTrace();
		        }
		    }
		

		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 28, 114, 106);
		panel_2.add(btnNewButton);
		
		lblNewLabel_10 = new JLabel("Regular:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(148, 66, 68, 30);
		panel_2.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Overtime:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(148, 107, 68, 14);
		panel_2.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Hours");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(246, 53, 46, 14);
		panel_2.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("Amount");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_13.setBounds(343, 53, 57, 14);
		panel_2.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("Net Pay:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_14.setBounds(433, 76, 75, 20);
		panel_2.add(lblNewLabel_14);
		
		regularHours = new JTextField();
		regularHours.setEditable(false);
		regularHours.setBounds(226, 73, 86, 20);
		panel_2.add(regularHours);
		regularHours.setColumns(10);
		
		overtimeHours = new JTextField();
		overtimeHours.setEditable(false);
		overtimeHours.setColumns(10);
		overtimeHours.setBounds(226, 106, 86, 20);
		panel_2.add(overtimeHours);
		
		regularAmount = new JTextField();
		regularAmount.setEditable(false);
		regularAmount.setColumns(10);
		regularAmount.setBounds(327, 73, 86, 20);
		panel_2.add(regularAmount);
		
		overtimeAmount = new JTextField();
		overtimeAmount.setEditable(false);
		overtimeAmount.setColumns(10);
		overtimeAmount.setBounds(327, 106, 86, 20);
		panel_2.add(overtimeAmount);
		
		netpay = new JTextField();
		netpay.setEditable(false);
		netpay.setBounds(518, 73, 86, 20);
		panel_2.add(netpay);
		netpay.setColumns(10);
		
		btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(651, 53, 114, 81);
		panel_2.add(btnNewButton_1);
	}
}
