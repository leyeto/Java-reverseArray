package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        

        System.out.println("Enter number of intergers");
        int count=scan.nextInt();
        scan.nextLine();
        int[] array=new int[count];

        for (int i= 0; i < array.length; i++){
            System.out.println("Enter value " +(i+1));
            array[i]=scan.nextInt();
            scan.nextLine();
        }
        scan.close();
        System.out.println("Array is: "+Arrays.toString(array));
        reverseV2(array);
        System.out.println("Reversed Array is: "+Arrays.toString(array));

        reverse(array);


    }
    public static void reverse(int[] array){
        int[] reverseArray=new int[array.length];

        for(int i=0; i < array.length ; i++){
            reverseArray[i]=array[array.length-1-i];
        }
        System.out.println(Arrays.toString(reverseArray));
        System.out.println(Arrays.toString(array));
    }
    public static void reverseV2(int[] array){
        int halfLength=array.length;
        int length=array.length-1;
        int temp;
        for(int i=0;i < halfLength; i++){
            temp=array[i];
            array[i]=array[length-i];
            temp=array[length-i];
        }
    }
}
