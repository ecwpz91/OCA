import player.PersonBean;
import java.util.ArrayList;

public class TestPersonBean {
    /**
     * Tester method "main" for class "PersonBean".
     *
     * @param arguments
     */
    public static void main(final String[] arguments) {
        final PersonBean person = new PersonBean();

        person.setName("Bob");
        person.setDeceased(false);
        person.setList(new ArrayList());

        // Output: "Bob [alive]"
        System.out.print(person.getName());
        System.out.println(person.isDeceased() ? " [deceased]" : " [alive]");
    }
}
