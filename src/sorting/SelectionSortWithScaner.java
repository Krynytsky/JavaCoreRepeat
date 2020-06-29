package sorting;

import java.util.Scanner;

public class SelectionSortWithScaner {
    public static void main(String[] args) {
        int size, i, j, templ;
        int[] arr = new int[25];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        size = scan.nextInt();
        System.out.println("Enter Array's element: ");
        for (i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Sorting Array using Selection Sort Technique..\n");
        for(i=0;i<size;i++){
            for(j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    templ = arr[i];
                    arr[i]= arr[j];
                    arr[j]=templ;
                }
            }
        }
        System.out.print("Now the Array after Sorting is :\n");
        for (i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
