public class Slizeren extends Person {
private int cunning;
private int determination;
private int ambition;
private int resourcefulness;
private int lustOfPower;


    public Slizeren(String name, String surname,int cunning, int determination, int ambition, int resourcefulness, int lustOfPower, int power, int transgeneration) {
        super (name, surname,power, transgeneration);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }


    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    public void setLustOfPower(int lustOfPower) {
        this.lustOfPower = lustOfPower;
    }
    private int AllPointsSliz(){
        int allPointsSliz = getAmbition() + getLustOfPower() + getResourcefulness() + getDetermination() + getCunning();
        return allPointsSliz;
    }

    public int getAllPointsSliz() {
        return AllPointsSliz();
    }

    @Override
    public String toString() {
        return "All information about student: \nName and surname - " + getName()  + " " + getSurname() + "." +
                "\nCunning - " + getCunning() + "\nDetermination - " + getDetermination() + "\nAmbition - " + getAmbition() +
                "\nResourcefulness - " + getResourcefulness() + "\nLust of power - " + getLustOfPower() +
                "\nPower - " + getPower() + "\nTrangeneration - " + getTransgeneration()+ "\n=====================";
    }

}
