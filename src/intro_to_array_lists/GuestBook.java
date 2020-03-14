package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame;
	JPanel panel;
	JButton addButton;
	JButton viewButton;
	ArrayList<String> nameList = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.go();
	}
	public void go() {
		frame = new JFrame();
		panel = new JPanel();
		addButton = new JButton();
		viewButton = new JButton();
		addButton.setText("Add Name");
		viewButton.setText("View Name");
		frame.add(panel);
		panel.add(addButton);
		panel.add(viewButton);
		addButton.addActionListener(this);
		viewButton.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}
	public String printNames() {
		String str = "";
		for(int i = 0; i < nameList.size();i++) {
			str = str + "Guest #" + i + ": " + nameList.get(i) + "\n";
		}
		return str;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton)e.getSource();
		if(buttonPressed.equals(addButton)) {
			nameList.add(JOptionPane.showInputDialog(null,"Enter a name"));
		}else if(buttonPressed.equals(viewButton)) {
			JOptionPane.showConfirmDialog(null, printNames());
		}
		
	}
}
