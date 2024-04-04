public class Main {
    public static void main(String[] args) {
        Clients client1 = new Clients("João", 938124822, "diogo.silv05@gmail.com");
        ClientDAO clientDAO = new ClientDAO();

        clientDAO.addClient(client1);

        clientDAO.closeConnection();
    }
}