package q3;
/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Anthony Figueroa
 * @version 1.0
 */
public class Address {
    /** Street address. */
    private String streetAddress;
    /** city. */
    private String city;
    /** State. */
    private String state;
    /** Postal code, any country. */
    private String postalCode;

    /**
     * Constructor: Sets up this address with the specified data.
     *
     * @param street
     *        Holds new streetAddress
     * @param town
     *        Holds new city
     * @param st
     *        Holds new state
     * @param code
     *        Holds new postalCode
     */
    public Address(String street, String town, String st, String code) {
        streetAddress = street;
        city = town;
        state = st;
        postalCode = code;
    }

    /**
     * Returns a description of this Address object.
     *
     * @return formatted value of streetAddress, city, state, zipCode
     */
    public String toString() {
        String result;

        result = streetAddress + "\n";
        result += city + ", " + state + "  " + postalCode;

        return result;
    }
}
