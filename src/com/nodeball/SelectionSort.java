package com.nodeball;

public class SelectionSort {
    //0(n2) - we need to shift the smallest items to the left
    public void sort(int [] array){
        for(int i = 0; i<array.length; i++){
            var minIndex = i;
            for(int j = i; j <array.length -1; j++){
                if(array[j] < array[minIndex]){
                    swapArray(array,j,j-1);
                }

            }
        }
    }

    private void swapArray(int[] array, int k, int i) {
        var temp = array[k];
        array[k] = array[i];
        array[k - 1] = temp;
    }
}
