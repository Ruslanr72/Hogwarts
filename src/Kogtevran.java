public class Kogtevran extends Person{
    private int clever;
    private int smart;
    private int wit;
    private int creation;


    public Kogtevran(String name, String surname, int clever, int smart, int wit, int creation, int power, int transgeneration) {
        super(name, surname, power, transgeneration);
        this.clever = clever;
        this.smart = smart;
        this.wit = wit;
        this.creation = creation;
    }


    public int getClever() {
        return clever;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    private int AllPointsKog(){
        int allPointsKog =  getClever() + getCreation() + getWit() + getSmart();
        return allPointsKog;
    }

    public int getAllPointsKog() {
        return AllPointsKog();
    }

    @Override
    public String toString() {
        return "All information about student: \nName and surname - " + getName()  + " " + getSurname() + "." +
                "\nClever - " + getClever() + "\nSmart - " + getSmart() + "\nWit - " + getWit() + "\nCreation - " + getCreation() +
                "\nPower - " + getPower() + "\nTrangeneration - " + getTransgeneration() + "\n=====================";
    }
}
