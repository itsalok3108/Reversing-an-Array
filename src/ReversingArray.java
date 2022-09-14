import java.util.Arrays;
import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int l= sc.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter the Array");
        for (int i=0; i< arr.length; i++)
            arr[i]=sc.nextInt();
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            swap(arr, start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int indexA, int indexB){
        int temp=arr[indexA];
        arr[indexA]=arr[indexB];
        arr[indexB]=temp;
    }
}
