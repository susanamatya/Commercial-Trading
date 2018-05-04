/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rozeep
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class UserPanel {
	private boolean bigA_Done=false;
	private boolean bigB_Done=false;
	private boolean bigC_Done=false;
	private Company_BigA a ;
	private Company_BigB b ;
	private Company_BigC c ;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPanel window = new UserPanel();
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
	public UserPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 718, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox selectCompany = new JComboBox();
		selectCompany.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
//				/	String query = "select * from SignUp";
//				FacilityHelper.findNumberOfFacilities();
				selectCompany.removeAllItems();
				for (int i = 0; i < 3; i++) {
//					System.out.println(FacilityHelper.Facilities[i]);
					selectCompany.addItem(Constants.companyNames[i]);
			}
			}});
		selectCompany.setBounds(171, 22, 162, 41);
		frame.getContentPane().add(selectCompany);
		
		JLabel lblSelectCompanyTo = new JLabel("or");
		lblSelectCompanyTo.setBounds(359, 35, 28, 14);
		frame.getContentPane().add(lblSelectCompanyTo);
		
		JButton auto = new JButton("Do Trade Autonomously");
		auto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (bigA_Done==false && bigB_Done==false && bigC_Done==false){
					a= new Company_BigA();
					b= new Company_BigB();
					c= new Company_BigC();
					b.makeA_Trade();
					a.makeA_Trade();
					c.makeA_Trade();
					a.getEachTradeResults();
					b.getEachTradeResults();
					c.getEachTradeResults();
					a.getResults();
					c.getResults();
					b.getResults();
					a.makePL_Statement();
					b.makePL_Statement();
					c.makePL_Statement();
					bigA_Done=true;
					bigB_Done=true;
					bigC_Done=true;
					
					JOptionPane.showMessageDialog(null, "Results Have been shown in the Console ");
				}else{
//					System.out.println("Kindly trade All the Three Companies First to see the Desired Result");
					JOptionPane.showMessageDialog(null, "You can Not Automatically trade Once you have Used Manual Method");
				}
			}
		});
		auto.setBounds(404, 22, 175, 41);
		frame.getContentPane().add(auto);
		
		JLabel label = new JLabel("Select Company To Trade");
		label.setBounds(39, 35, 140, 14);
		frame.getContentPane().add(label);
		
		JButton btnTrade = new JButton("Trade");
		btnTrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String company=(String)selectCompany.getSelectedItem();
				System.out.println(company ); //checker
				if(company.equals("BIG_A") && bigA_Done == false){
					 a = new Company_BigA();
					 a.makeA_Trade();
					 a.getEachTradeResults();
					 a.getResults();
					 a.makePL_Statement();
					bigA_Done=true;
					JOptionPane.showMessageDialog(null, "Company A Made a Trade, Watch the Console for the Details");
					
				}
				else if(company.equals("BIG_B") && bigB_Done==false){
					b=new Company_BigB();
					 b.makeA_Trade();
					 b.getEachTradeResults();
					 b.getResults();
					 b.makePL_Statement();
					bigB_Done=true;
					JOptionPane.showMessageDialog(null, "Company B Made a Trade, Watch the Console for the Details");
					
				}
				else if(company.equals("BIG_C") && bigC_Done==false){
					c=new Company_BigC();
					 c.makeA_Trade();
					 c.getEachTradeResults();
					 c.getResults();
					 c.makePL_Statement();
					bigC_Done=true;
					JOptionPane.showMessageDialog(null, "C0mpany C Made a Trade, Watch the Console for the Details ");
					
				}
				else{
					System.out.println("Sory this company has already made a trade ");
					
				
				}
			}
		});
		btnTrade.setBounds(206, 74, 89, 23);
		frame.getContentPane().add(btnTrade);
		
		JButton compare = new JButton("Compare All Three Companies");
		compare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (bigA_Done==true && bigB_Done==true && bigC_Done==true){
					Profit_Loss_Info.compareAll();
					JOptionPane.showMessageDialog(null, "Results Have been shown in the Console ");
				}else{
//					System.out.println("Kindly trade All the Three Companies First to see the Desired Result");
					JOptionPane.showMessageDialog(null, "Kindly trade All the Three Companies First to see the Desired Result");
				}
				
				
			}
		});
		compare.setBounds(238, 139, 290, 58);
		frame.getContentPane().add(compare);
	}
}
