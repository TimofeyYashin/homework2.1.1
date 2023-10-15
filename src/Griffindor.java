public class Griffindor extends Hogwarts {

    public Griffindor(String name, int nobility, int honor, int courage, int distance, int power) {
      super(power, distance, name);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    private int nobility;

    private int honor;

    private int courage;

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int sum() {
        return courage + honor + nobility;
    }
}
