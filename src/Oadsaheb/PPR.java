package Oadsaheb;
import java.util.*;
public class PPR {
    public static void main(String[] args) {
        //insertion sort
        int arr[] = {12, -3, 2, 4, 6, 7, 8, -9, 34, 55, 65, 32, -1};
        for (int i=1;i< arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}