public class Clients {

    private int id;
    private String name;
    private int phone;
    private String gmail;

    public Clients(String name, int phone, String gmail){
        this.name = name;
        this.phone = phone;
        this.gmail = gmail;
    }

    public int getId(){
        return id;
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