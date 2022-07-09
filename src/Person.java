public class Person {
    private int power;
    private int transgeneration;
    private String name;
    private String surname;

    public Person(String name, String surname, int power, int transgeneration) {
        this.power = power;
        this.transgeneration = transgeneration;
        this.name = name;
        this.surname = surname;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgeneration() {
        return transgeneration;
    }

    public void setTransgeneration(int transgeneration) {
        this.transgeneration = transgeneration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private int AllPointsPower() {
        int allPointsPower = getPower() + getTransgeneration();
        return allPointsPower;
    }

    public int getAllPointsPower() {
        return AllPointsPower();
    }
}
