public class Puffendui extends Person {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffendui(String name, String surname, int industriousness, int loyalty, int honesty, int power, int transgeneration) {
        super(name, surname, power, transgeneration);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    private int AllPointsPuff(){
        int allPointsPuff = getHonesty() + getLoyalty() + getIndustriousness();
        return allPointsPuff;
    }

    public int getAllPointsPuff() {
        return AllPointsPuff();
    }

    @Override
    public String toString() {
        return "All information about student: \nName and surname - " + getName()  + " " + getSurname() + "." +
                "\nIndustriousness - " + getIndustriousness() + "\nLoyalty - " + getLoyalty() + "\nHonesty - " + getHonesty() +
                "\nPower - " + getPower() + "\nTrangeneration - " + getTransgeneration() + "\n=====================";
    }
}
