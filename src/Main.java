public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindors = {
                new Griffindor("Harry", "Potter", 24, 55, 65, 43, 90),
                new Griffindor("Ron", "Uizly", 55, 59, 60, 41, 75),
                new Griffindor("Hermiona", "Granger", 67, 89, 43, 100, 100)
        };

        Slizeren[] slizerens = {
                new Slizeren("Drako", "Malfoy", 67, 89, 43, 21, 100, 89, 76),
                new Slizeren("Graham", "Montegu", 72, 12, 44, 56, 75, 55, 78),
                new Slizeren("Gragory", "Goyl", 57, 94, 45, 23, 69, 45, 65)
        };

        Puffendui[] puffenduis = {
                new Puffendui("Zaharia", "Smit", 54, 65, 22, 74, 63),
                new Puffendui("Sedrik", "Diggory", 89, 41, 52, 97, 13),
                new Puffendui("Jastin", "Fint-Flatchi", 41, 87, 99, 45, 78),
        };

        Kogtevran[] kogtevran = {
                new Kogtevran("Chjou", "Chang", 87, 45, 64, 14, 87, 63),
                new Kogtevran("Padma", "Pattil", 78, 87, 45, 65, 74, 90),
                new Kogtevran("Markus", "Belbi", 74, 67, 88, 77, 66, 55)
        };

        System.out.println(griffindors[0]);
        System.out.println(slizerens[0]);
        System.out.println(puffenduis[0]);
        System.out.println(kogtevran[0]);
        //////////////////////////////////////

        for (int i = 0; i < griffindors.length; i++) {
            if (griffindors[i].getAllPointsGriff() != 0) {
                System.out.println(griffindors[i].getName() + " " + griffindors[i].getSurname() + " Has " + griffindors[i].getAllPointsGriff() + " points");
            }
        }//Расчет очков у Гриффиндора
        if (griffindors[2].getAllPointsGriff() > griffindors[1].getAllPointsGriff()) {
            System.out.println("=====================" + "\n" + griffindors[2].getName() + " Is better Griff than " + griffindors[1].getName() + "." + "\nShe has more points!");
        } else {
            System.out.println("=====================" + "\n" + griffindors[1].getName() + " Is better Griff than " + griffindors[2].getName() + "." + "\nShe has more points!");
        }
//Лучший среди Гриффиндоров
        System.out.println("===============");
        for (int i = 0; i < slizerens.length; i++) {
            if (slizerens[i].getAllPointsSliz() != 0) {
                System.out.println(slizerens[i].getName() + " " + slizerens[i].getSurname() + " Has " + slizerens[i].getAllPointsSliz() + " points");
            }
        }//Расчет очков у Слизерен
        if (slizerens[2].getAllPointsSliz() > slizerens[1].getAllPointsSliz()) {
            System.out.println("=====================" + "\n" + slizerens[2].getName() + " Is better Slizz than " + slizerens[1].getName() + "." + "\nHe has more points!");
        } else {
            System.out.println("=====================" + "\n" + slizerens[1].getName() + " Is better Slizz than " + slizerens[2].getName() + "." + "\nHe has more points!");
            //Лучший среди Слизерен

        }
        System.out.println("=========================");
        for (int i = 0; i < puffenduis.length; i++) {
            if (puffenduis[i].getAllPointsPuff() != 0) {
                System.out.println(puffenduis[i].getName() + " " + puffenduis[i].getSurname() + " Has " + puffenduis[i].getAllPointsPuff() + " points");
            }
        }//Расчет очков у Puffendui
        if (puffenduis[2].getAllPointsPuff() > puffenduis[1].getAllPointsPuff()) {
            System.out.println("=====================" + "\n" + puffenduis[2].getName() + " Is better Puff than " + puffenduis[1].getName() + "." + "\nHe has more points!");
        } else {
            System.out.println("=====================" + "\n" + puffenduis[1].getName() + " Is better Puff than " + puffenduis[2].getName() + "." + "\nHe has more points!");
            //Лучший среди Puffendui

        }
        System.out.println("============================");

        for (int i = 0; i < kogtevran.length; i++) {
            if (kogtevran[i].getAllPointsKog() != 0) {
                System.out.println(kogtevran[i].getName() + " " + kogtevran[i].getSurname() + " Has " + kogtevran[i].getAllPointsKog() + " points");
            }
        }//Расчет очков у Kogtevran
        if (kogtevran[2].getAllPointsKog() > kogtevran[1].getAllPointsKog()) {
            System.out.println("=====================" + "\n" + kogtevran[2].getName() + " Is better Kogtevran than " + kogtevran[1].getName() + "." + "\nHe has more points!");
        } else {
            System.out.println("=====================" + "\n" + kogtevran[1].getName() + " Is better Kogtevran than " + kogtevran[2].getName() + "." + "\nHe has more points!");
            //Лучший среди Kogtevran

        }
        System.out.println("======================");//Сравнение 2х учеников с разных факультетов. Все поля через геттеры (приватные)

        if (slizerens[2].getAllPointsPower() > griffindors[1].getAllPointsPower()) {
            System.out.println("\n" + slizerens[2].getName() + " Is stronger than " + griffindors[1].getName() + ".");
        } else {
            System.out.println("\n" + griffindors[1].getName() + " Is stronger than " + slizerens[2].getName() + ".");
        }
    }
}