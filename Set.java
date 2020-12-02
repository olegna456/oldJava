package last;

import java.util.*;

class Set {
	Random rand = new Random();
	
	Options option = new Options();
	//UserInput use = new UserInput();
	 ArrayList<String> rowVal = new ArrayList<String>();
	 ArrayList<String> columnVal = new ArrayList<String>();
	 LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
	
	
	private int row;
	private int column;
	private int maxLength = 6;
	
	void setRow(int row) {
		this.row = row;
	}
	
	void setColumn(int column) {
		this.column = column;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	void setRowValues() {
		int counter = 0;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				String random = "";
				while(counter < maxLength) {
					random += String.valueOf((char)(rand.nextInt(95)+32));
					counter++;
				}
				rowVal.add(random);
				counter = 0;
			}
		}
		
	}
	
	void setColumnValues() {
		int counter = 0;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				String random = "";
				while(counter < maxLength) {
					random += String.valueOf((char)(rand.nextInt(95)+32));
					counter++;
				}
				columnVal.add(random);
				counter = 0;
			}
		}
		
	}
	
	void createHashMap() {
		int i = 0;
		while(i < rowVal.size()) {
			String temp = rowVal.get(i);
			String temp2 = columnVal.get(i);
			map.put(temp, temp2);
			i++;
		}
		//use.selectOption();
	}
	
	void printHashTable() {
		Iterator it = map.entrySet().iterator();
		int ctr = 0;
		int i = 0;
		int g = 0;
		while(i < row) {			
			while((ctr < column) && (g < rowVal.size())) {
				Map.Entry pair = (Map.Entry)it.next();
				System.out.print(pair.getKey() + ":" + pair.getValue() + "\t");
				ctr++;
				g++;
			}
			System.out.println();
			ctr = 0;
			i++;
		}
		System.out.println();
		//use.selectOption();
	}
	
	public LinkedHashMap<String, String> getHashMap() {
		return map;
	}
	
	/*public ArrayList<String> getRowVal() {
		return rowVal;
	}*/
	
	public ArrayList<String> getColumnVal() {
		return columnVal;
	}
}