public class BubbleArray{
    public static void main(String[] args) {
        int arr[] = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array before bubble sort");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("Array after bubble sort");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }//End main

    public static void bubbleSort(int[] arr2){
        int n = arr2.length;
        int temp = 0;
        for ( int i = 0; i < n; i++){
            for(int j = 1; j < (n - i); j++){
                if(arr2[j - 1] > arr2[j]){
                    //swap elements
                    temp = arr2[j - 1];
                    arr2[j - 1] = arr2[j];
                    arr2[j] = temp;
                }//End if
            }//End for2
        }//End for1
    }//End bubbleSort 
}//End class