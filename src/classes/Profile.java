package classes;

import enums.Status;

import java.util.List;

public class Profile {
    private  int ID;
    private  String username;
    private  String username1;
    private  int phoneNumber;
    private  int phoneNumber1;
    private String password;
    private String password1;
    private String image;
    Status status;
    private List<String> messages;


    public Profile(int ID, String username, int phoneNumber, String password, String image, Status status, List<String> messages) {
        this.ID = ID;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.image = image;
        this.status = status;
        this.messages = messages;
    }


    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public int getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(int phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "ID=" + ID +
                ", username='" + username + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", password='" + password + '\'' +
                ", image='" + image + '\'' +
                ", status=" + status +
                ", messages=" + messages +
                '}';
    }
}
