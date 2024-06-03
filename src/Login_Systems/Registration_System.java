package Login_Systems;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration_System extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtMembershipRegistrationSystem;
	private JTextField txtRefNo;
	private JTextField txtFirstName;
	private JTextField txtSurname;
	private JTextField txtAddress;
	private JTextField txtPostCode;
	private JTextField txtTelephone;
	private JTextField txtDateReg;
	private JTable table;
	protected JLabel jtxtRefNo;
	protected JLabel jtxtFirstName;
	protected JLabel jtxtSurname;
	protected JLabel jtxtAddress;
	protected JLabel jtxtPostCode;
	protected JLabel jtxtTelephone;
	protected JLabel jtxtDateReg;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_System frame = new Registration_System();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration_System() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1254, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(127, 255, 212));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(32, 178, 170)));
		panel.setBounds(10, 11, 1228, 485);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 1208, 69);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(32, 178, 170)));
		panel_1.setBackground(new Color(127, 255, 212));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtMembershipRegistrationSystem = new JTextField();
		txtMembershipRegistrationSystem.setFont(new Font("Tahoma", Font.BOLD, 35));
		txtMembershipRegistrationSystem.setText("Membership Registration System");
		txtMembershipRegistrationSystem.setBounds(352, 11, 593, 47);
		panel_1.add(txtMembershipRegistrationSystem);
		txtMembershipRegistrationSystem.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(32, 178, 170)));
		panel_1_1.setBackground(new Color(127, 255, 212));
		panel_1_1.setBounds(10, 84, 342, 281);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel = new JLabel("Reference No.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(25, 25, 127, 14);
		panel_1_1.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFirstName.setBounds(25, 50, 127, 14);
		panel_1_1.add(lblFirstName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSurname.setBounds(25, 75, 127, 14);
		panel_1_1.add(lblSurname);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAddress.setBounds(25, 100, 127, 14);
		panel_1_1.add(lblAddress);
		
		JLabel lblPostCode = new JLabel("Post Code");
		lblPostCode.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPostCode.setBounds(25, 125, 127, 14);
		panel_1_1.add(lblPostCode);
		
		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelephone.setBounds(25, 150, 127, 14);
		panel_1_1.add(lblTelephone);
		
		JLabel lblDateOfReg = new JLabel("Date Registered");
		lblDateOfReg.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDateOfReg.setBounds(25, 174, 127, 14);
		panel_1_1.add(lblDateOfReg);
		
		JLabel lblProofOfId = new JLabel("Proof Of ID");
		lblProofOfId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProofOfId.setBounds(25, 199, 127, 14);
		panel_1_1.add(lblProofOfId);
		
		JLabel lblMembershipType = new JLabel("Membership Type");
		lblMembershipType.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMembershipType.setBounds(25, 224, 127, 14);
		panel_1_1.add(lblMembershipType);
		
		JLabel lblAmountPaid = new JLabel("Amount Paid");
		lblAmountPaid.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAmountPaid.setBounds(25, 249, 127, 14);
		panel_1_1.add(lblAmountPaid);
		
		txtRefNo = new JTextField();
		txtRefNo.setBounds(187, 22, 127, 20);
		panel_1_1.add(txtRefNo);
		txtRefNo.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(187, 47, 127, 20);
		panel_1_1.add(txtFirstName);
		
		txtSurname = new JTextField();
		txtSurname.setColumns(10);
		txtSurname.setBounds(187, 72, 127, 20);
		panel_1_1.add(txtSurname);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(187, 97, 127, 20);
		panel_1_1.add(txtAddress);
		
		txtPostCode = new JTextField();
		txtPostCode.setColumns(10);
		txtPostCode.setBounds(187, 122, 127, 20);
		panel_1_1.add(txtPostCode);
		
		txtTelephone = new JTextField();
		txtTelephone.setColumns(10);
		txtTelephone.setBounds(187, 147, 127, 20);
		panel_1_1.add(txtTelephone);
		
		txtDateReg = new JTextField();
		txtDateReg.setColumns(10);
		txtDateReg.setBounds(187, 171, 127, 20);
		panel_1_1.add(txtDateReg);
		
		JComboBox cmbProofOfID = new JComboBox();
		cmbProofOfID.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Student ID", "National ID", "Driving Licence", "Passport"}));
		cmbProofOfID.setBounds(187, 195, 127, 22);
		panel_1_1.add(cmbProofOfID);
		
		JComboBox cmbMembership = new JComboBox();
		cmbMembership.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Monthly ", "Quartely", "Six Months", "Annually"}));
		cmbMembership.setBounds(187, 220, 127, 22);
		panel_1_1.add(cmbMembership);
		
		JComboBox cmbAmountPaid = new JComboBox();
		cmbAmountPaid.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "$45", "$120", "$200", "$370"}));
		cmbAmountPaid.setBounds(187, 245, 127, 22);
		panel_1_1.add(cmbAmountPaid);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(32, 178, 170)));
		panel_1_1_1.setBackground(new Color(127, 255, 212));
		panel_1_1_1.setBounds(10, 370, 1208, 104);
		panel.add(panel_1_1_1);
		
		JButton btnNewButton = new JButton("Add Record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model= (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
					txtRefNo.getText(),
					txtFirstName.getText(),
					txtSurname.getText(),
					txtAddress.getText(),
					txtPostCode.getText(),
					txtTelephone.getText(),
					txtDateReg.getText(),
					cmbProofOfID.getSelectedItem(),
					cmbMembership.getSelectedItem(),
					cmbAmountPaid.getSelectedItem(),
					
				});
				
				if (table.getSelectedRow()==-1){
					if (table.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "Membership Update Confirmed", "Membership Management System",
					        JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 38, 128, 23);
		panel_1_1_1.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRefNo.setText("");
				txtFirstName.setText("");
				txtSurname.setText("");
				txtAddress.setText("");
				txtPostCode.setText("");
				txtTelephone.setText("");
				txtDateReg.setText("");
				cmbProofOfID.setSelectedItem("Make a Selection");
				cmbMembership.setSelectedItem("Make a Selection");
				cmbAmountPaid.setSelectedItem("Make a Selection");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBounds(259, 38, 103, 23);
		panel_1_1_1.add(btnReset);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
				
				      JOptionPane.showMessageDialog(null,  "No data to delete",
				    		  "Memebership Management System", JOptionPane.OK_OPTION);
			        }else {
			        	
			        	JOptionPane.showMessageDialog(null,  "Select data to delete",
					    		  "Memebership Management System", JOptionPane.OK_OPTION);
			        }
		       }else {
		        	model.removeRow(table.getSelectedRow());
			   
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDelete.setBounds(663, 38, 103, 23);
		panel_1_1_1.add(btnDelete);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				        int confirmed = JOptionPane.showConfirmDialog(null, "Confirm if you want to exit", "Membership Registration System", JOptionPane.YES_NO_OPTION);
				        if (confirmed == JOptionPane.YES_OPTION) {
				            dispose(); // Close the current frame

				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(839, 38, 103, 23);
		panel_1_1_1.add(btnExit);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{
					table.print();
				}
				catch(java.awt.print.PrinterException e) {
					System.err.format("No Printer found",  e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrint.setBounds(451, 38, 103, 23);
		panel_1_1_1.add(btnPrint);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(32, 178, 170)));
		panel_1_1_1_1.setBackground(new Color(127, 255, 212));
		panel_1_1_1_1.setBounds(362, 84, 856, 281);
		panel.add(panel_1_1_1_1);
		panel_1_1_1_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 836, 259);
		panel_1_1_1_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Reference No.", "First Name", "Surname", "Address", "Post Code", "Telephone", "Date Reg.", "Proof Of ID.", "Membership Type", "Amount Paid"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(89);
		table.getColumnModel().getColumn(1).setPreferredWidth(105);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(123);
		table.getColumnModel().getColumn(4).setPreferredWidth(87);
		table.getColumnModel().getColumn(5).setPreferredWidth(120);
		table.getColumnModel().getColumn(6).setPreferredWidth(113);
		table.getColumnModel().getColumn(7).setPreferredWidth(124);
		table.getColumnModel().getColumn(8).setPreferredWidth(135);
		table.getColumnModel().getColumn(9).setPreferredWidth(99);
	}
}
