public class Hufflepuff extends  Hogwarts {
    private int hardworking, loyal, honest;

    public Hufflepuff(String name, int hardworking, int loyal, int honest, int distance, int power) {
        super(power,distance,name);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public int sum() {
        return hardworking + loyal + honest;
    }
}
