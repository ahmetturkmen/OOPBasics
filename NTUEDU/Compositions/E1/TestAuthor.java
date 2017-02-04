/**
 * Created by ahmetturkmen on 1/25/17.
 */
public class TestAuthor {

    public static void main(String[] args) {

        Author ahteck = new Author("Tah Ah Teck", "teck@nowhere.com", 'm');
        System.out.println(ahteck);


        ahteck.setEmail("teck@somewhere.com");
        System.out.println(ahteck);
        System.out.printf("name is :" + ahteck.getName());
        System.out.println("email is : " + ahteck.getEmail());
        System.out.println("gender is :" + ahteck.getGender());

    }
}
