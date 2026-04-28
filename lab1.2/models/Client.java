package models;

public class Client {

    private String name;
    private String cpf;
    private String phone;
    private int points;

    public Client(String name, String cpf, String phone) {
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPoints() {
        return points;
    }

    public int increasePoints(int newPoints) {
        this.points += newPoints;

        return this.points;
    }

    public void zeroPoints() {
        this.points = 0;
    }

    

}