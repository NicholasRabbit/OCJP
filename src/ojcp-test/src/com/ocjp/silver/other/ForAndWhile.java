package com.ocjp.silver.other;

public class ForAndWhile {

	public static void main(String[] args){
		
		int row = 10;
		for( ; row > 0; ){
			int col = row;
			while(col >= 0){
				System.out.print(col + " ");
				col -= 2;
			}
			row = row / col;  // Note that col is -2 here, not 0.
		}

		int index = 0;
		while (index++ < 5) {
			System.out.println("index: " + index);
		}

	}

}


