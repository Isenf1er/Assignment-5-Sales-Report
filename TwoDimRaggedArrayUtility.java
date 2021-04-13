/* 
* Class: CMSC203 
* Instructor: Ahmed Tarek
* Description: A program that creates a sales report for Retail District #5 and calculates the holiday bonuses of each store in each category
* Due: 4/12/2021
* Platform/compiler: Eclipse
* I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Print your Name here: Nicholas Prakoso
*/

import java.io.*;
import java.util.*;
import java.nio.file.Files;

public class TwoDimRaggedArrayUtility {
	public static double[][] readFile(File file){
		double newArray[][] = new double[10][10];
		try {
			List<String> data = Files.readAllLines(file.toPath());
			int rows = data.size();
			for(int i = 0; i < rows; i++) {
				String getRow = data.get(i);
				String strings[] = getRow.split(" ");
				for(int k = 0; k < strings.length; k++) {
					newArray[i][k] = Double.parseDouble(strings[k]);
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return newArray;
	}
	
	public static void writeToFile(double[][] data, File outputFile) {
		String x = "";
		for (double[] raggedArray : data) {
			for (double write : raggedArray) {
				x += write + " ";
			}
			x += "\n";
		}
		try {
			PrintWriter writeFile = new PrintWriter(outputFile);
			writeFile.print(x);
			writeFile.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static double getTotal(double[][] data) {
		double total = 0;
		for(double[] array : data) {
			for(double arrayTwo : array) {
				total += arrayTwo;
			}
		}
		return total;
	}
	
	public static double getAverage(double[][] data) {
		double sum = 0;
		int count = 0;
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				sum += data[i][j];
				count += 1;
			}
		}
		double average = sum/count;
		return average;
	}
	
	public static double getRowTotal(double[][] data, int row) {
		double rowSum = 0;
		for(int i = 0; i < data[row].length; i++) {
			rowSum += data[row][i];
		}
		return rowSum;
	}
	
	public static double getColumnTotal(double[][] data, int col) {
		double colSum = 0;
		for(int i = 0; i < data.length; i++) {
			if(col <= data[i].length-1) {
				colSum += data[i][col];
			}
		}
		return colSum;
	}
	
	public static double getHighestInRow(double[][] data, int row) {
		double highestValue = data[row][0];
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] > highestValue) {
				highestValue = data[row][i];
			}
		}
		return highestValue;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row) {
		double highestValue = data[row][0];
		int newHighestValue = (int)highestValue;
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] > highestValue) {
				highestValue = data[row][i];
			}
		}
		return newHighestValue;
	}
	
	public static double getLowestInRow(double[][] data, int row) {
		double lowestValue = data[row][0];
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] < lowestValue) {
				lowestValue = data[row][i];
			}
		}
		return lowestValue;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row) {
		double lowestValue = data[row][0];
		int newLowestValue = (int)lowestValue;
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] < lowestValue) {
				lowestValue = data[row][i];
			}
		}
		return newLowestValue;
	}
	
	public static double getHighestInColumn(double[][] data, int col) {
		double highestValue = data[0][col];
		for(int i = 0; i < data.length; i++) {
			if(col <= data[i].length-1) {
				if(data[i][col] > highestValue) {
					highestValue = data[i][col];
				}
			}
		}
		return highestValue;
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col) {
		double highestValue = data[0][col];
		int newHighestValue = (int)highestValue;
		for(int i = 0; i < data.length; i++) {
			if(col <= data[i].length-1) {
				if(data[i][col] > highestValue) {
					highestValue = data[i][col];
				}
			}
		}
		return newHighestValue;
	}
	
	public static double getLowestInColumn(double[][] data, int col) {
		double lowestValue = data[0][col];
		for(int i = 0; i < data.length; i++) {
			if(col <= data[i].length-1) {
				if(data[i][col] < lowestValue) {
					lowestValue = data[i][col];
				}
			}
		}
		return lowestValue;
	}
	
	public static int getLowestInColumnIndex(double[][] data, int col) {
		double lowestValue = data[0][col];
		int newLowestValue = (int)lowestValue;
		for(int i = 0; i < data.length; i++) {
			if(col <= data[i].length-1) {
				if(data[i][col] < lowestValue) {
					lowestValue = data[i][col];
				}
			}
		}
		return newLowestValue;
	}
	
	public static double getHighestInArray(double[][] data) {
		double highestValue = data[0][0];
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				if(data[i][j] > highestValue) {
					highestValue = data[i][j];
				}
			}
		}
		return highestValue;
	}
	
	public static double getLowestInArray(double[][] data) {
		double lowestValue = data[0][0];
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				if(data[i][j] < lowestValue) {
					lowestValue = data[i][j];
				}
			}
		}
		return lowestValue;
	}
}

/*
 * Programmer Name: Nicholas Prakoso
 */