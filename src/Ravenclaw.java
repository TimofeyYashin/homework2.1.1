public class Ravenclaw extends Hogwarts {
    private int smart, wise, witty, creative;

    public Ravenclaw(String name, int smart, int wise, int witty, int creative, int distance, int power) {
        super(power, distance, name);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public int sum() {
        return smart + wise + witty + creative;
    }
}
