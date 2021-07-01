package cashing_system.processing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import cashin_system.containers.Constructor;
import cashin_system.containers.frmLogin;
import cashin_system.containers.frmMain;

public class ActionHandler implements ActionListener{
	
	public String selected;
	public boolean active_session;
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("test");
		if(e.getActionCommand() == "start session") {
			if(selected == "-- no selection --") {
				JOptionPane.showMessageDialog(new JFrame(), "no selection");
			}else{
				if(active_session) {
					JOptionPane.showMessageDialog(new JFrame(), "already active session, terminate session before you can start a new one");
				}
				else {
				frmMain frmmain = new frmMain();
				active_session = true;
				}
				
				
			}
		}
	}
		
	
	
	
	
		
}
