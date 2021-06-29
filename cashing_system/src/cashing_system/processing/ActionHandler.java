package cashing_system.processing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import cashin_system.containers.Constructor;
import cashin_system.containers.frmLogin;

public class ActionHandler{
	
	public ActionListener action = new ActionListener() {
		
		
		public void actionPerformed(ActionEvent act) {
			frmLogin frmlogin = new frmLogin();
			
			if(act.getActionCommand() == "login") {
				JComboBox workers_selection = (frmlogin.workers_selection);
				
				
				if(frmlogin.workers_selection.getSelectedItem().toString()  == "-- no selection --") {
					System.out.println("please make a selection");
				}
				else  {
					System.out.print("logged in");
					
				}
				}
			
		}
	};
		
}
