package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Random;

public class SearchTimes {

  public static void main(String[] args) {
    Random rng = new Random();
    int[] haystack = new int[1_000_000];
    int[] needles = new int[100_000];
    for (int i = 0; i < haystack.length; i++) {
      haystack[i] = rng.nextInt();
    }
    for (int i = 0; i < needles.length; i++) {
      needles[i] = rng.nextInt();
    }
    long startTime;
    long endTime;
    startTime = System.currentTimeMillis();
    for (int i = 0; i < needles.length; i++) {
      Search.linearSearch(needles[i], haystack);
    }
    endTime = System.currentTimeMillis();
    System.out.printf("Time elapsed for linear search: %.3f seconds%n",
        (endTime - startTime) / 1000d);

//    MergeSorter sorter = new MergeSorter();
    startTime = System.currentTimeMillis();
    Arrays.sort(haystack);
    endTime = System.currentTimeMillis();
    System.out.printf("Time elapsed for QuickSort: %.3f seconds%n",
        (endTime - startTime) / 1000d);

    startTime = System.currentTimeMillis();
    for (int i = 0; i < needles.length; i++) {
      Arrays.binarySearch(haystack, needles[i]);
    }
    endTime = System.currentTimeMillis();
    System.out.printf("Time elapsed for BinarySearch: %.3f seconds%n",
        (endTime - startTime) / 1000d);

  }

}
