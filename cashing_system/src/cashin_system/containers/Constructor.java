package cashin_system.containers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;


import cashing_system.connect.MySQLConnection;
import cashing_system.processing.ActionHandler;

public class Constructor{
	frmLogin frmlogin = new frmLogin();
	public static void main(String[] args) {
		try {
			Connection con = MySQLConnection.getConnection();
			System.out.print("connected successfull");
		
		}
		catch (Exception e) {
			System.out.print("unable to connect");
		}
		frmLogin frmlogin = new frmLogin();
		ActionHandler actionhandler = new ActionHandler();
		frmlogin.login.addActionListener(actionhandler.action);
		String r = frmlogin.workers_selection.getSelectedItem().toString();
		frmlogin.setVisible(true);

		
		
		
			
			
		}

	
	}

