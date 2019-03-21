package edu.cnm.deepdive;

import java.util.Arrays;

public class MergeSorter {

  public void sort(int[] input) {
    if (input.length > 1) {
      int midpoint = input.length / 2;
      // First Array will go from 0 (inclusive) to midpoint (exclusive).
      // Second Array will go from midpoint (inclusive) to input.length (exclusive)
      int[] left = Arrays.copyOfRange(input, 0, midpoint);
      int[] right = Arrays.copyOfRange(input, midpoint, input.length);
      sort(left);
      sort(right);
      merge(input, left, right);
    }
  }

  private void merge(int[] output, int[] left, int[] right) {
    int leftIndex = 0;
    int rightIndex = 0;
    int outputIndex = 0;
    while (leftIndex < left.length && rightIndex < right.length) {
      if (left[leftIndex] < right[rightIndex]) {
        output[outputIndex] = left[leftIndex];
        leftIndex++;
      } else {
        output[outputIndex] = right[rightIndex];
        rightIndex++;
      }
      outputIndex++;
    }
    while (leftIndex < left.length) {
      output[outputIndex] = left[leftIndex];
      leftIndex++;
      outputIndex++;
    }
    while (rightIndex < right.length) {
      output[outputIndex] = right[rightIndex];
      rightIndex++;
      outputIndex++;
    }
  }
}
