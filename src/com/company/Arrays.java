package com.company;

public class Arrays {
    static void main(String[] args) {
        //Problem 1
        float[] arr = {12.2f, 56.78f, 89.56f, 23.4f, 90.87f};
        float sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("sum = "+sum);

        //Problem 2
        int[] arr2 = {12, 45, 7, 23, 89, 34, 56, 10};
        int key = 22;
        boolean found = false;
        for(int num : arr2){
            if(num == key){
                found = true;
                System.out.println("element found");
                break;
            }
        }
        if(!found){
            System.out.println("element not found");
        }

        //Problem 3
        int[] physicsMarks = {78, 65, 92, 84, 71, 56, 88, 73, 95, 67};
        int noOfStud = physicsMarks.length;
        int phySum = 0;
        for(int marks : physicsMarks){
            phySum += marks;
        }
        float avg = (float) phySum/noOfStud;
        System.out.println("Average marks : "+avg);

        //Problem 4
        int[][] matrix1 = {{1,2,3},{4,5,6}};
        int[][] matrix2 = {{7,8,9},{10,11,12}};
        int[][] sumBoth = {{0,0,0},{0,0,0}};
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                sumBoth[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(sumBoth[i][j]+" ");
            }
            System.out.println();
        }

        //Problem 5
        int[] arr3 = {34, 12, 67, 89, 23, 45};
        for(int i = arr3.length-1; i>=0; i--){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();

        //Problem 6
        int max = 0;
        for(int i=0; i<arr3.length; i++){
            if(arr3[i]>max){
                max = arr3[i];
            }
        }
        System.out.println("Maximum element : "+max);

        //Problem 7
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr3.length; i++){
            if(arr3[i]<min){
                min = arr3[i];
            }
        }
        System.out.println("Minimum element : "+min);

        //Problem 8
        int[] sortedArr = {5, 12, 18, 23, 31, 47, 56, 68, 79, 95};
        int[] unsortedArr = {47, 12, 89, 5, 31, 68, 23, 95, 18, 56};
        boolean isSorted = true;
        for(int i=1; i<sortedArr.length; i++){
            if(sortedArr[i-1]<sortedArr[i]){
                continue;
            }else{
                isSorted = false;
            }
        }
        if(!isSorted){
            System.out.println("not sorted");
        }else{
            System.out.println("sorted");
        }
    }
}
