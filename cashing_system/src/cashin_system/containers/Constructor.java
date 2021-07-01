package cashin_system.containers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;


import cashing_system.connect.MySQLConnection;
import cashing_system.processing.ActionHandler;

public class Constructor {
	ActionListener action = new ActionListener() {
		
		
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
	};
	
	public static void main(String[] args) {
		
		frmLogin frmlogin = new frmLogin();
			
		
		try {
			Connection con = MySQLConnection.getConnection();
			
		
		}
		catch (Exception e) {
			System.out.print("unable to connect");
		}
		
		
		
		

		
		
		
			
			
		}
	
	

}

