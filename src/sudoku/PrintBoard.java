package sudoku;

public class PrintBoard {
	
	static void print(int[][] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) { 
			System.out.print(array[i][j] + "   ");
			}
			System.out.print("\n\n");
			
		}
			
			
	}
		
}
