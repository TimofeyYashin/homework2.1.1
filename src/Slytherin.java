 public class Slytherin extends Hogwarts {
     private int cunning, determination, ambition, resourcefulness, thirst;

     public Slytherin(String name, int cunning, int determination, int ambition, int resourcefulness, int thirst, int distance, int power) {
         super(power, distance, name);
         this.cunning = cunning;
         this.determination = determination;
         this.ambition = ambition;
         this.resourcefulness = resourcefulness;
         this.thirst = thirst;
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

     public int getThirst() {
         return thirst;
     }

     public void setThirst(int thirst) {
         this.thirst = thirst;
     }

     public int sum() {
         return cunning + determination + ambition + resourcefulness + thirst;
     }
 }
