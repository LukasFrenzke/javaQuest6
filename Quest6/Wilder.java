package Quest6;

public class Wilder {
    String firstname;
    boolean present;

    public Wilder(String firstname, boolean present) {
        this.firstname = firstname;
        this.present = present;
    }
    
    public String getFirstname(){
        return this.firstname;
    }

    public boolean isPresent(){
        return this.present;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setPresent(boolean present){
        this.present = present;
    }

    public String whoAmI(){
        String output = "My name is " + this.firstname + " and I am present";
        if (this.present == true){
            return output;
        }
        else {
            return output = "My name is " + this.firstname + " and I am not present";
        }
    }
}
