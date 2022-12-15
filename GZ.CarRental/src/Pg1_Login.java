
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;
import javax.swing.JPasswordField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author garet
 */
public class Pg1_Login {
    public void actionPerformed (ActionEvent e){
        
    }
    private Frame OrWin;
    private Button Cust_Login, Adm_Login, Cust_Register, WinQ;
    private Label WinLbl, UsrNmLbl, UsrPwLbl;
    private TextField UsrNm;
    private JPasswordField UsrPw;
    
    public Pg1_Login() {
        
        
        OrWin = new Frame("GZ.Car Rental System");
        
        Cust_Login = new Button("Customer Login");
        Adm_Login = new Button("Admin Login");
        Cust_Register = new Button("Customer Register");
        WinQ = new Button("Quit");
        
        WinLbl = new Label("GZ.Car Rental At Your Service");
        WinLbl.setFont(new Font("Monospaced", Font.BOLD, 25));
        UsrNmLbl = new Label("Username: ");
        UsrPwLbl = new Label("Password: ");
        
        UsrNm = new TextField();
        UsrNm.setPreferredSize(new Dimension(80, 10));
        UsrPw = new JPasswordField();
        UsrPw.setPreferredSize(new Dimension(80, 10));
        
        
        OrWin.setSize(new Dimension(800,600 ));
        OrWin.setLayout(new GridLayout(9,1));
        OrWin.setBackground(Color.decode("#B7AFA3"));
        
        OrWin.add(WinLbl);
        OrWin.add(UsrNmLbl);
        OrWin.add(UsrNm);
        OrWin.add(UsrPwLbl);
        OrWin.add(UsrPw);
        OrWin.add(Cust_Login);
        OrWin.add(Adm_Login);
        OrWin.add(Cust_Register);
        OrWin.add(WinQ);
        
        Cust_Login.addActionListener(new LoginActionListener());
        Adm_Login.addActionListener(new LoginActionListener());
        Cust_Register.addActionListener(new LoginActionListener());
        WinQ.addActionListener(new LoginActionListener());
        
        OrWin.setVisible(true);
    }
    
    public Frame getOrWin() {
        return OrWin;
    }
    
    private class LoginActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e){
            switch (e.getActionCommand()){
                
                case "Customer Login" -> {
                    
                    new Pg2C_MainInterface().setVisible(true);
                    
                }
                case "Quit" -> {
                    
                    int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Thank You For Using Our Service", "Confirmation Window", JOptionPane.OK_OPTION);
                    if(showConfirmDialog == 0){
                        System.exit(0);
                    }
                    
                }
                } 
            }
        }
}
