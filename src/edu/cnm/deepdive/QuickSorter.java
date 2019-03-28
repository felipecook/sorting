package edu.cnm.deepdive;

public class QuickSorter extends Sorter {

  @Override
  public void sort(int[] data) {
    sort(data, 0, data.length);
  }

  private void sort(int[] data, int from, int to) {
    if (to <= from + 1) {
      return;
    }
    int pivot = data[from];
    int divider = from;
    for (int i = from + 1; i < to; i++) {

      if (data[i] <= pivot) {
        divider++;
        int temp = data[i];
        data[i] = data[divider];
        data[divider] = temp;
      }
    }

    data[from] = data[divider];
    data[divider] = pivot;
    sort(data, from, divider);
    sort(data, divider + 1, to);

  }

}
