public class PrintService {
    public void printDescription(Griffindor student) {
        System.out.println("Cвойства ученика " + student.getName() + ": храбрость - " + student.getCourage() + ", честь - " + student.getHonor() + ", благородство - " + student.getNobility());
    }

    public void printDescription(Slytherin student) {
        System.out.println("Свойства ученика " + student.getName() + ": хитрость - " + student.getCunning() + ",  решительность - " + student.getDetermination() + ", амбициозность - " + student.getAmbition() + ", находчивость - " + student.getResourcefulness() + ", жажда власти- " + student.getThirst());
    }

    public void printDescription(Hufflepuff student) {
        System.out.println("Свойства ученика " + student.getName() + ": трудолюбиe - " + student.getHardworking() + ", вернocть - " + student.getLoyal() + ", честнoсть - " + student.getHonest());
    }

    public void printDescription(Ravenclaw student) {
        System.out.println("Свойства ученика " + student.getName() + ": ум - " + student.getSmart() + ", мудрость - " + student.getWise() + ", остроумие - " + student.getWitty() + ", творчествo - " + student.getCreative());
    }
}
