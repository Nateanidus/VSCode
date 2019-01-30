public class TestArray{
    public static void main(String[] args) {
        
        //Create a double array.
        double[] myList={1.9, 2.9, 3.4, 3.5};

        //Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i]+ " ");//1.9, 2.9, 3.4, 3.5
        }

        // Summon all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("\nTotal is "+ total);//11.7

        //Finding the largest element
        double max = myList[0];
        for(int i = 1; i < myList.length; i++){
            if(myList[i] > max){
                max = myList[i];
                System.out.println("Max changed to " + max);
            }
        }
        System.out.println("Max is " + max);//3.5
    }//End main
}//End class