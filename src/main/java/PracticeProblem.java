/*
File Name: Arrays, split, swapping
Author: Jim Li
Date Created: May 1, 2026
Date Last Modified: May 1, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void stringSwap(String[] array, int index1, int index2){
		String target1 = array[index1];
		String target2 = array[index2];
		array[index1] = target2;
		array[index2] = target1;
	}

	public static void reverse(int[] array){
		int[] tempArray = new int[array.length];
		for (int i = 0; i < array.length; i++){
			tempArray[i] = array[i];
		}
		for (int i = 0; i < array.length; i++){
			array[i] = tempArray[array.length - i - 1];
		}
	}

	public static String[] toWordArray(String str){
		String[] array = str.split(" ");
		int counter = 0;
		for (int i = 0; i < array.length; i++){
			if (array[i].equals("")){
				counter++;
			}
		}
		int j = 0;
		String[] array2 = new String[array.length - counter];
		for (int i = 0; i < array.length; i++){
			if (!array[i].equals("")){
				array2[j] = array[i];
				j++;
			}
		}
		return array2;
	}

}
