package Hotel_demo_Lesson_03.Client.client;

public class Client {
    private String phoneNumber;
    private String clientName;

    public Client(String phoneNumber, String clientName) {
        this.phoneNumber = phoneNumber;
        this.clientName = clientName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getClientName() {
        return clientName;
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (this == anotherObject) return true;
        if (anotherObject == null || getClass() != anotherObject.getClass()) return false;

        Client client = (Client) anotherObject;

        return phoneNumber.equals(client.phoneNumber);
    }

    @Override
    public int hashCode() {
        return phoneNumber.hashCode();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Client{");
        sb.append("phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", clientName='").append(clientName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
