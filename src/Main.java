public class Main {
    public static void main(String[] args) {

        Griffindor potter = new Griffindor("Гарри Потер", 30, 40, 60, 50, 33);
        Griffindor hermione = new Griffindor("Гермиона Грейнджер", 8, 15, 20, 99, 55);
        Griffindor ron = new Griffindor("Рон Уизли", 2, 34, 50, 22, 70);
        Slytherin draco = new Slytherin("Драко Малфой", 20, 25, 30, 48, 45, 79, 20);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 30, 23, 39, 42, 41, 9, 80);
        Slytherin gregory = new Slytherin("Грегори Гойл", 39, 55, 45, 22, 10, 60, 80);
        Hufflepuff zachariah = new Hufflepuff("Захария Смит", 33, 44, 33, 44, 55);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 45, 23, 11, 45, 67);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 98, 47, 22, 67, 11);
        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", 22, 55, 65, 21, 78, 25);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 33, 54, 28, 75, 50, 43);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 40, 29, 58, 47, 70, 67);

        PrintService printService = new PrintService();
        printService.printDescription(potter);
        printService.printDescription(hermione);
        printService.printDescription(ron);
        printService.printDescription(draco);
        printService.printDescription(graham);
        printService.printDescription(gregory);
        printService.printDescription(zachariah);
        printService.printDescription(cedric);
        printService.printDescription(justin);
        printService.printDescription(zhou);
        printService.printDescription(padma);
        printService.printDescription(marcus);
        CalcService calcService = new CalcService();
        calcService.compare(potter, hermione);
        calcService.compare(graham, gregory);
        calcService.compare(zachariah, justin);
        calcService.compare(zhou, marcus);
        calcService.compareHogwarts(potter, draco);
    }
}