package com.company;

public class BinarySearchPract {
    public static int binarySearch(int a[], int l, int h, int key){
        if(l == h){
            if (key == a[l])
                return l;
            else
                return -1;

        }
        else if(l > h){
            return -1;
        }

        int mid = (l + h)/2;

        if(key == a[mid]){
            return mid;
        } else if(key > a[mid]){
            return binarySearch(a, mid+1, h, key);
        }else {
            return binarySearch(a, l, mid - 1, key);
        }
    }

    public static void main(String[] args){
        int[] a = {11, 19, 24, 34, 55, 65, 71, 83, 91};
        int index = binarySearch(a, 0, 8, 65);
        System.out.println("Index: " + index);
    }
}
