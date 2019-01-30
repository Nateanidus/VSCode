public class ArrayObject{
    public static void main(String[] args) {
        int [] myIntArray = {1, 3, 4, 5,};// unused array
        Book[] bookArray = new Book[7];
        bookArray[0] = new Book("Daniel", "As Daniel Codes","2019");//print shit
        System.out.println("The title of the book is: " + bookArray[0].title);
        
        bookArray[0].title = "A new title";
        System.out.println("The title of the book is: " + bookArray[0].title);
    }//end main
}//end class