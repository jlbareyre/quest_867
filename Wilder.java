public class Wilder {

    
    private String firstname;
    private boolean aware;
    
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    } 
    
    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        return "Je m'appelle " + firstname + " et je " + ( aware ? "suis" : "ne suis pas" ) + " aware.";

    }
}
