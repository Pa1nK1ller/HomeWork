package HomeWork5;

public class Main {

    public static void main(String[] args) {
        Staff pers1 = new Staff("Ivanov Ivan Ivanovich", "teacher", "III@mail.com", "335543", 60000, 38);
        Staff pers2 = new Staff("Petrov Ivan Vasilievich", "seller", "piv@mail.com", "2255446", 33000, 40);
        Staff pers3 = new Staff("Смирнова Анастасия Петровна", "Педиатор", "SMA@mail.com", "9627370855", 63000, 62);
        Staff pers4 = new Staff("Тарасенко Игорь Лвьвич");
        Staff pers5 = new Staff("Ткаченко Елена Яковлевна", "Уборщица", "TKYA@mail.com", "7244271", 15000, 25);

        Staff[] persons = {pers1, pers2, pers3, pers4, pers5};
        for (Staff person : persons) {
            //person.printInfo();
            if (person.age > 40) {
                person.printInfo();

            }
        }
    }
}


