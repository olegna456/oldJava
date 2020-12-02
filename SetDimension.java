package last;
import java.util.*;
class SetDimension {
	
	Scanner console = new Scanner(System.in);
	private int row;
	private int column;	
	private int choice;
	SetDimension() {
		
	}
	Set s = new Set();
	SetDimension(Set set, int row, int column){
		set.setRow(row);
		set.setColumn(column);
		set.setRowValues();
		set.setColumnValues();
		set.createHashMap();
		//set.printHashTable();
	}
	
	int inputRow() {
		System.out.print("Enter number of row: ");
		row = Integer.parseInt(console.nextLine());	
		return row;
	}
	
	int inputColumn() {
		System.out.print("Enter number of column: ");
		column = Integer.parseInt(console.nextLine());
		return column;
	}

	void setPrint() {
		s.printHashTable();
	}

	
	

}