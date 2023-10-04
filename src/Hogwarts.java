public class Hogwarts {

    protected int power;
    protected int distance;
    protected String name;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int summ() {
        return power + distance;
    }
}
