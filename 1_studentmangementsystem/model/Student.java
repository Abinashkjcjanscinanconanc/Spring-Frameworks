package model;

public class Student {
    private String name;
    private int roll;
    private double fee;

    public Student() {
    }

    public Student(String name, int roll, double fee) {
        this.name = name;
        this.roll = roll;
        this.fee = fee;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return this.roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public double getFee() {
        return this.fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", roll=" + roll + ", fee=" + fee + "]";
    }

}
