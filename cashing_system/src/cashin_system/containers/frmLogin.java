package cashin_system.containers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import cashing_system.connect.MySQLConnection;

public class frmLogin extends JFrame{
	public String[] workers = {"-- no selection --", "amir", "raed", "zou", "janus"};
	public JButton login = new JButton("login");
	public JComboBox workers_selection = new JComboBox(workers);
	
	public frmLogin() {
	this.setLayout(null);
	this.setSize(400, 400);
	
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	login.setSize(80, 40);
	this.add(login);
	login.setLocation(200 - 40, 200 - 10);
	
	
	
	workers_selection.setSize(200, 40);
	workers_selection.setLocation(20, 50);
	this.add(workers_selection);
	
	
	
	}

}
