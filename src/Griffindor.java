public class Griffindor extends Person {
    private int nobility;
    private int honour;
    private int bravery;



    public Griffindor(String name, String surname, int nobility, int honour, int bravery, int power, int transgeneration) {
        super (name, surname, power, transgeneration);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;

    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

private int AllPointsGrif(){
        int allPointsGrif = getHonour() + getNobility() + getBravery();
    return allPointsGrif;
}

    public int getAllPointsGriff() {
        return AllPointsGrif();
    }

    @Override
    public String toString() {
        return "All information about student: \nName and surname - " + getName()  + " " + getSurname() + "." +
                "\nNobility - " + getNobility() + "\nHonour - " + getHonour() + "\nBravery - " + getBravery() +
                "\nPower - " + getPower() + "\nTrangeneration - " + getTransgeneration() + "\n=====================";
    }
}
