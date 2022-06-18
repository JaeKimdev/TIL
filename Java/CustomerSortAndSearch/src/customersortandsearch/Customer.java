package customersortandsearch;

public class Customer implements Comparable<Customer> {

    private int id;
    private String name;
    private String email;
    private String mobile;

    public Customer(int id, String name, String email, String mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    @Override
    public int compareTo(Customer comparecust) {
        int compareid=((Customer)comparecust).getId();
        return this.id-compareid;
    }
    
    @Override
    public String toString() { 
        return "Customer id(" + id + "), Name : " + name + ", Mobile : "
                + mobile + ", E-Mail : " + email + " ";
    }

}
