package models;

public class Producer {
    private int id;
    private  String FullName;
    private String lastName;

    public Producer() {
    }

    public Producer(int id, String fullName, String lastName) {
        this.id = id;
        this.FullName = fullName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "FullName='" + FullName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
