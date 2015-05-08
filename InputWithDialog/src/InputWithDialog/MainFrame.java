package InputWithDialog;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame{
	private JLabel label = new JLabel();
	private JButton button = new JButton("add");
	
	public MainFrame(){
		
		button.addActionListener(new Click());
		add(label);
		add(button, BorderLayout.SOUTH);
		
		setVisible(true);
		pack();
	}
	
	class Click implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			InputDialog d = new InputDialog();
			
			d.setVisible(true);
			
			label.setText(d.getText()); //on inscrit le texte
			
			d.dispose(); //on kill le JDialog
			//asjdsd
		}
		
	}

}
