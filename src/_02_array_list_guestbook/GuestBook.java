package _02_array_list_guestbook;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class GuestBook {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	static JButton Polly = new JButton();
	static JButton Gigi = new JButton();
	ArrayList <String> yeah = new ArrayList<String>();
	public void main(String[] args) {
		frame.add(panel);
		frame.setVisible(true);
		Polly.setText("View Names");
		Gigi.setText("Add names");
		Polly.addActionListener((e) -> {
			System.out.println("bozo");
		});
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
