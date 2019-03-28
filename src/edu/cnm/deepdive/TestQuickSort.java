package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Random;

public class TestQuickSort {

  public static void main(String[] args) {
    int[] data = new int[1000];
    Random rng = new Random();
    for (int i = 0; i < data.length; i++) {
      data[i] = rng.nextInt();
    }
    System.out.println(Arrays.toString(data));
    new QuickSorter().sort(data);
    System.out.println(Arrays.toString(data));


  }

}
