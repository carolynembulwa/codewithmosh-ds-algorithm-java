package com.nodeball;

public class MergeSort {
    //divide and conque
    // dividing 0(log n)
    //merging - 0(n)

    //mergesort 0(n log n)

    //space 0(n)

    public void sort(int[] array){
        if(array.length < 2){
            return;
        }
        //divide the array
        var middle = array.length /2;
        int[] left  = new int[middle];
        for(int i = 0; i < middle; i++){
            left[i] = array[i];
        }
        int[] right  = new int[array.length - middle];
        for(int i = middle; i < array.length; i++){
            right[i - middle] = array[i];
        }

        //sort the array / recrursion
        sort(left);
        sort(right);


        //merge array
        merge(left,right,array);
    }

    private void merge(int[] left, int[] right, int[] result){
        int i = 0, j = 0, k  = 0;

        while(i <left.length && j < right.length){
            if(left[i]<= right[j]){
                result[k++] = left[i++];
            }else{
                result[k++] = right[j++];
            }
        }

        while(i<left.length){
            result[k++] = left[i++];
        }

        while(j<right.length){
            result[k++] = right[j++];
        }
    }
}
