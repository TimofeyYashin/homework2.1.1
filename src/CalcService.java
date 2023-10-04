public class CalcService {
    public void compare(Griffindor a, Griffindor b) {
        if (a.sum() > b.sum()) {
            System.out.println(a.getName() + " лучше " + b.getName());
        } else System.out.println(b.getName() + " лучше " + a.getName());
    }

    public void compare(Slytherin a, Slytherin b) {
        if (a.sum() > b.sum()) {
            System.out.println(a.getName() + " лучше " + b.getName());
        } else System.out.println(b.getName() + " лучше " + a.getName());
    }

    public void compare(Hufflepuff a, Hufflepuff b) {
        if (a.sum() > b.sum()) {
            System.out.println(a.getName() + " лучше " + b.getName());
        } else System.out.println(b.getName() + " лучше " + a.getName());

    }

    public void compare(Ravenclaw a, Ravenclaw b) {
        if (a.sum() > b.sum()) {
            System.out.println(a.getName() + " лучше " + b.getName());
        } else System.out.println(b.getName() + " лучше " + a.getName());
    }

    public void compareHogwarts(Hogwarts a, Hogwarts b) {
        if (a.summ() > b.summ()) {
            System.out.println(a.getName() + " лучше " + b.getName());
        } else System.out.println(b.getName() + " лучше " + a.getName());
    }
}
