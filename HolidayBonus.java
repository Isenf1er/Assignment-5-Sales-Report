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

public class HolidayBonus {
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		double[][] holidayBonusArray = new double[data.length][];
		for(int i = 0; i < data.length; i++) {
			holidayBonusArray[i] = new double[data[i].length];
		}
		for(int j = 0, k = 0; j < holidayBonusArray.length; j++, k++) {
			int highestInColumnIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, j);
			int lowestInColumnIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, j);
			if(j < holidayBonusArray[k].length) {
				holidayBonusArray[highestInColumnIndex][j] = high;
				holidayBonusArray[lowestInColumnIndex][j] = low;
				if(k == highestInColumnIndex || k == lowestInColumnIndex) {
					continue;
				}
				else {
					holidayBonusArray[k][j] = other;
				}
			}
		}
		double[] bonusPerStore = new double[data.length];
		for(int i = 0; i < holidayBonusArray.length; i++) {
			for(int k = 0; k < holidayBonusArray[i].length; k++) {
				bonusPerStore[i] += holidayBonusArray[i][k];
			}
		}
		return bonusPerStore;
	}
	
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		double[][] holidayBonusArray = new double[data.length][];
		for(int i = 0; i < data.length; i++) {
			holidayBonusArray[i] = new double[data[i].length];
		}
		for(int j = 0, k = 0; j < holidayBonusArray.length; j++, k++) {
			int highestInColumnIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, j);
			int lowestInColumnIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, j);
			if(j < holidayBonusArray[k].length) {
				holidayBonusArray[highestInColumnIndex][j] = high;
				holidayBonusArray[lowestInColumnIndex][j] = low;
				if(k == highestInColumnIndex || k == lowestInColumnIndex) {
					continue;
				}
				else {
					holidayBonusArray[k][j] = other;
				}
			}
		}
		double total = 0.0;
		for(int x = 0; x < holidayBonusArray.length; x++) {
			for(int y = 0; y < holidayBonusArray[y].length; y++) {
				total += holidayBonusArray[x][y];
			}
		}
		return total;
	}
}

/*
 * Programmer Name: Nicholas Prakoso
 */