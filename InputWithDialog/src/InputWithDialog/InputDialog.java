package InputWithDialog;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;


public class InputDialog extends JDialog{

	private JTextField input = new JTextField(50);
	private JButton button = new JButton("save");

	public InputDialog(){

		button.addActionListener(new Click());
		
		setModal(true); //du momeent que la fenetre JDialog est ouverte, on ne peut pas aller vers une autre fen�tre
		
		add(input);
		add(button, BorderLayout.SOUTH);

		pack();
	}
	
	public String getText(){
		return input.getText();
	}

	class Click implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			
			
			setVisible(false); //quand on clique sur save, la fen�tre s'efface
			
		}
	}

}
