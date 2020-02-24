package player;

import java.util.List;

public class PersonBean implements java.io.Serializable {

    /** Properties **/
    private boolean deceased = false;

    private List list;

    /** Property "name", readable/writable. */
    private String name = null;

    /** No-arg constructor (takes no arguments). */
    public PersonBean() {
    }

    public List getList() {
        return list;
    }
	
    public void setList(final List list) {
        this.list = list;
    }

    /**
     * Getter for property "name".
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for property "name".
     *
     * @param value
     */
    public void setName(final String value) {
        this.name = value;
    }

    /**
     * Getter for property "deceased"
     * Different syntax for a boolean field (is v.s. get)
     */
    public boolean isDeceased() {
        return deceased;
    }

    /**
     * Setter for property "deceased".
     * @param value
     */
    public void setDeceased(boolean value) {
        deceased = value;
    }
}
