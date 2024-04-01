import java.util.*;
public class selectionsort {
    public static void printArray(int arr[])
    {
        System.out.print("The sorted element is:");
        for(int j=0;j<arr.length;j++)
        {

            System.out.print(arr[j]+" ");
        }

        System.out.println();
    }
    public static void main(String[] args) {

        System.out.print("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements:");
        // Taking input
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        // logic
        for(int j=0;j<size-1;j++)
        {
            int smallest = j;
            for(int k=j+1;k<size;k++)
            {
                if(arr[smallest]>arr[k] )
                {
                    smallest = k;

                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[j];
            arr[j] = temp;
        }
        printArray(arr);
    }
}
