package com.Sorting;

public class QuickSort {

	private class element {
		int key = 0;
		String data;
	}

	private void SWAP(element first, element second) {
		String temp;
		temp = first.data;
		first.data = second.data;
		second.data = temp;
	}

	void quicksort(element list[], int left, int right) {
		int pivot, i, j; // It is assumed that list[left].key <= list[right+1].key
		if (left < right) {
			i= left; j=right+1;
			pivot = list[left].key;
			do {
				do i++; while (list[i].key < pivot);
				do j--; while (list[j].key > pivot);
				if(i<j)
					SWAP(list[i], list[j]);
			} while (i<j);
			SWAP(list[left], list[j]);
			quicksort(list, left, j-1);
			quicksort(list, j+1, right);


		}
	}
}


