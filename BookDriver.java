public class BookDriver {
    public static void main(String[] args) {
        Book myFirstBookObject = new Book();
        System.out.println(myFirstBookObject.author); // Should print Daniel Cisneros

        Book mySecondBookObject = new Book("Markus", "Code is life", "2018");
        System.out.println(mySecondBookObject.title); // Should print Code is Life

        mySecondBookObject.setAuthor("Chris");
        System.out.println(mySecondBookObject.author); // Should print Chris.

        System.out.println(myFirstBookObject.getAuthor()); // Should be Daniel Cisneros this is using the method.

        System.out.println("****************");
        myFirstBookObject.printToConsole();
    }
}