package com.nodeball;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
        count++;
    }

    public void insert(int item){
        //if the array is full, resize it
        if(items.length == count){
            //create new array  trice the original size
            int[] newItems = new int[count * 2];
            //copy array the existing items
            for(int i = 0; i<count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        //add new items at the end
        items[count++] = item;

    }

    public void insertAt(int item, int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        items[index] = item;

    }


    public void removeAt(int index){
        //validate index
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }

        //shift item one step to the left to fill the whole removed

        for(int i = index; i<count; i++){
            items[i] = items[i+1];
            count --;
        }
    }

    public int searchArray(int item){
        //if we find it lets return index
        for(int i =0; i< count; i++){
            if(items[i] == item){
                return i;
            }
        }
        // if no index is found
        return -1;

    }

    public int largestNumber(){
        int max = 0;
        for(int item:items){
            if(item > max){
                max = item;
            }
        }
        return max;

    }

    public Array commonItems(Array other){
        var intersection = new Array(count);

        for (int item : items)
            if (other.indexOf(item) >= 0)
                intersection.insert(item);

        return intersection;

    }

    public void reverse(){
        int[] reversed = new int[count];
        for(int i=0; i <count; i++){
            //reversed
            reversed[count-1] = items[i];
            count--;

        }

        for(int k = 0; k<count; k++){
            System.out.println(items[k]);
        }

    }
    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }
    public void print(){
        for(int i=0; i <count; i++){
            System.out.println(items[i]);
        }
    }

}

