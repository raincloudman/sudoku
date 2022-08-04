package sudoku;

import javax.swing.JFrame;

public class GUI {

	public static void gui() {
		
		JFrame frame = new JFrame();
		frame.setTitle("sudoku");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(1000,1000); //x and y dimention of frame
		frame.setVisible(true);
	}
	
}
