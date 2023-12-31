package com.cloudvandana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {

	public static void main(String[] args) {
		Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        // Convert the array to a list
        List<Integer> list = new ArrayList<>(Arrays.asList(array));

        // Shuffle the list
        Collections.shuffle(list);

        // Convert the list back to an array
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        // Print the shuffled array
        System.out.println(Arrays.toString(shuffledArray));

	}

}
