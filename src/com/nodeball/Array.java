package com.nodeball;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
        count++;
    }


    public void insert(int item){
        //O(1):
        resizeifRequired();
        //add new items at the end
        items[count++] = item;

    }

    public void insertAt(int item, int index){
        //O(n): Because we have to iterate over
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        resizeifRequired();
        for(int i = count - 1; i>= index; i--){
            items[i+1] = items[i];
        }
        items[index] = item;
        count++;

    }

    private void resizeifRequired(){
        if(items.length == count){
            //create new array  trice the original size
            int[] newItems =  new int[count * 2];

            //copy array the existing items
            for(int i = 0; i<count; i++){
                newItems[i] = items[i];
            }

            //return resized array
            items = newItems;
        }
    }



    public void removeAt(int index){
        //O(n): Because we have to iterate over when shifting to fill the hole
        //validate index
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }

        //shift item one step to the left to fill the hole
        for(int i = index; i<count; i++){
            items[i] = items[i+1];
            count --;
        }
    }

    public int searchArray(int item){
        //search by value O(n): Because we have to iterate over
        //search by index O(1):

        //if we find it lets return index
        for(int i =0; i< count; i++){
            if(items[i] == item){
                return i;
            }
        }
        // if no index is found
        return -1;

        //return item by index
        //return items[index];

    }

    public int largestNumber(){
        // O(n): Because we have to iterate over
        // the entire array to find the largest
        // number. This number may be at the end
        // of the array (worst case scenario).
        int max = 0;
        for(int item:items){
            if(item > max){
                max = item;
            }
        }
        return max;

    }

    public Array commonItems(Array other){
        // O(n): Because we have to iterate over
        var intersection = new Array(count);

        for (int item : items)
            if (other.searchArray(item) >= 0)
                intersection.insert(item);

        return intersection;

    }

    public void reverse(){
        // O(n): Because we have to iterate over
        int[] reversed = new int[count];
        for(int i=0; i <count; i++){
            //reversed
            reversed[i] = items[count - i - 1];
            count--;
        }

        items = reversed;

    }
    public void print(){
        // O(n): Because we have to iterate over
        for(int i=0; i <count; i++){
            System.out.println(items[i]);
        }
    }

    //1. Question:​ Find the median of two sorted arrays. eg.
    //arra1 = [1.3,4]
    //arr2 = [2,4,6]
    //medium(arr1,arr2) = 3.5



    //2. Question:​ Given an unsorted array, find the length of the
    // longest sequence of consecutive numbers in the array.

    //consecutive([​4​, ​2​, ​1​, ​6​, ​5​]) = ​3​, [​4​, ​5​, ​6​]
    // consecutive([​5​, ​5​, ​3​, ​1​]) = ​1​, [​1​], [​3​], or [​5​]


    //3. Merge K Arrays
    //Question:​ Given k sorted arrays,
    // merge them into a single sorted array.
    // merge({{​1​, ​4​, ​7​},{​2​, ​5​, ​8​},{​3​, ​6​, ​9​}}) = {​1​, ​2​, ​3​, ​4​, ​5​, ​6​, ​7​, ​8​, ​9​}


    //4. Merge Arrays
    //Question:​ Given 2 sorted arrays, A and B,
    // where A is long enough to hold the contents of A and B,
    // write a function to copy the contents of B into A without
    // using any buffer or additional memory.
    //eg.
    //A = {​1​,​3​,​5​,​0​,​0​,​0​} B = {​2​,​4​,​6​} mergeArrays(A, B) A = {​1​,​2​,​3​,​4​,​5​,​6​}


    //5. Question:​ Given an array, write a function to find any subarray that sums to zero, if one exists.
    //eg.
    //    zeroSum({​1​, ​2​, ​-5​, ​1​, ​2​, ​-1​}) = [​2​, ​-5​, ​1​, ​2​]


    //6. Question:​ Given an array of integers where each
    // value 1 <= x <= len(array), write a function that
    // finds all the duplicates in the array.
    //eg.
    //dups([​1​, ​2​, ​3​]) = []
    //dups([​1​, ​2​, ​2​]) = [2]
    //dups([​3​, ​3​, ​3​]) []3
    //dups([​2​, ​1​, ​2​, ​1​]) = [​1​, ​2​]

}

