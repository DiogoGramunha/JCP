/**
 * clients
 */
public class clients {
    
    private String name;
    private int phone;
    private String gmail;
    

    public clients(String name, int phone, String gmail){
        this.name = name;
        this.phone = phone;
        this.gmail = gmail;
    }

    public String getName(){
        return name;
    }

    public int getPhone(){
        return phone;
    }

    public String getGmail(){
        return gmail;
    }
}