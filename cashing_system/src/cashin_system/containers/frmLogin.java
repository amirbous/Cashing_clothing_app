package cashin_system.containers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import cashing_system.connect.MySQLConnection;
import cashing_system.processing.ActionHandler;

public class frmLogin extends JFrame{
	ActionHandler actionhandler = new ActionHandler();
	public String r;
	public boolean verified;
	
	public String[] workers = {"-- no selection --", "amir", "raed", "zou", "janus"};
	public JButton login = new JButton("start session");
	public JComboBox workers_selection = new JComboBox(workers);
	
	public frmLogin() {
	actionhandler.selected = "-- no selection --";
	this.setLayout(null);
	this.setSize(400, 400);
	
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	login.setSize(120, 40);
	this.add(login);
	login.setLocation(200 - 40, 200 - 10);
	workers_selection.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == workers_selection) {
				actionhandler.selected = workers_selection.getSelectedItem().toString();
				
			}
			
		}
	});
	login.addActionListener(actionhandler);
	
	
	workers_selection.setSize(200, 40);
	workers_selection.setLocation(20, 50);
	this.add(workers_selection);
	this.setVisible(true);
	
	
	}

	
	

}
