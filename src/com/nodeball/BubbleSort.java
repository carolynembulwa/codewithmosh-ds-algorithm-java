package com.nodeball;

//0(n2) - we need to shift the largest items to the right
public class BubbleSort {
    public void sort(int [] array){
        for( int i = 0; i <array.length; i++){
            for(int k = 1; k < array.length -i; k++){
                if(array[k] < array[k -1] ){
                    swapArray(array, k, k-1);

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
