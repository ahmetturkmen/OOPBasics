
/**
 * Created by ahmetturkmen on 1/25/17.
 */
public class TestBook {

    public static void main (String [] args) {
        Author ahteck = new Author("Tah Ah Teck ", "ahTeck@somewhere.com", 'm');

        System.out.println(ahteck);

        Book dummyBook = new Book("Java for dummies",ahteck,9.99,99);
        System.out.println(dummyBook);

        dummyBook.setPrice(8.88);
        dummyBook.setQty(88);

        System.out.println(dummyBook);
        System.out.println("name is : "+dummyBook.getName());
        System.out.println("price is :"+dummyBook.getAuthor());
        System.out.println("qty is : "+dummyBook.getQty());
        System.out.println("author is : "+dummyBook.getAuthor()); // invoke Author's toString() method.
        System.out.println("author's name is :"+dummyBook.getAuthor().getName());
        System.out.println("author email is : "+dummyBook.getAuthor().getEmail());
        System.out.println("author's gender is : "+dummyBook.getAuthor().getGender());


        // Using  an Anonymous Author instance to create a Book instance

        Book moreDummyBook = new Book("JAva for Dummies",new Author("Peter Lee","peter@nowhere.com",'m'), 19.9,8);

        System.out.println(moreDummyBook); // implements toString() method in book class

        
    }

