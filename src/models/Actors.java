package models;

public class Actors {
    int id;
    private String fullname;
    private String role;

    public Actors() {
    }

    public Actors(int id,String fullname, String role){
        this.id = id;
        this.fullname = fullname;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Actors{" +
                "fullname='" + fullname + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
