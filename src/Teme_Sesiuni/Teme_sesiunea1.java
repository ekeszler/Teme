package Teme_Sesiuni;

import java.util.Scanner;

public class Teme_sesiunea1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Scrie un program care sa interschimbe valorile a doua variabile de tip int
        System.out.println("Exercitiul 1");
        System.out.println("introduceti primul numar");
        int a1 = scanner.nextInt();
        System.out.println("introduceti al doilea numar");
        int b1 = scanner.nextInt();
        int c1 = a1;
        a1 = b1;
        b1 = c1;
        System.out.println("numerele inversate sunt:");
        System.out.println(a1);
        System.out.println(b1);

        //Scrie un program care sa calculeze media aritmetica a 3 numere
        System.out.println("Exercitiul 2");
        System.out.println("Introduceti cele trei numere:");
        System.out.print("a=");
        double a2 = scanner.nextDouble();
        System.out.print("b=");
        double b2 = scanner.nextDouble();
        System.out.print("c=");
        double c2 = scanner.nextDouble();
        double med2 = (a2 + b2 + c2) / 3;
        System.out.print("media aritmetica este:");
        System.out.println(med2);

        //Scrie un program care converteste din grade Fahrenheit in grade Celsius
        System.out.println("Exercitiul 3");
        System.out.println("Introduceti temperatura dorita in grade Farenheit");
        double tempf = scanner.nextDouble();
        double tempc = (tempf - 32) / 1.8;
        System.out.println("Temperatura in grade celsius este:");
        System.out.print(tempc);

        //[LIVE] Determina daca un utilizator se poate loga in aplicatie.
        System.out.println("Exercitiul 4");
        String Username = "erik";
        String Password = "abcd";
        System.out.print("Username:");
        String inputUsername = scanner.next();
        System.out.print("Password:");
        String inputPassword = scanner.next();
        Boolean isUserLoggedIn = inputUsername.equals(Username) && inputPassword.equals(Password);
        if ((Username == inputUsername) && (Password == inputPassword)) {
            System.out.println("Logat");
        } else {
            System.out.println("Credentiale incorecte"); // aici imi afiseaza credentiale incorecte chiar daca pun aceleasi valori. nu stiu de ce.
        }

        //Un utilizator poate vizualiza un video premium daca este un membru premium, sau daca a cumparat acel vide. In plus, server-ul trebuie sa fie on-line
        System.out.println("Exercitiul 5");
        System.out.println("Esti utilizator premium?");
        boolean isPremiumMember = scanner.nextBoolean();
        System.out.println("Ai cumparat clipul?");
        boolean isBoughtVideo = scanner.nextBoolean();
        System.out.println("Serverul e online?");
        boolean isServerOnline = scanner.nextBoolean();
        boolean canViewVideo = (isPremiumMember || isBoughtVideo) && isServerOnline;
        if ((isPremiumMember || isBoughtVideo) && isServerOnline) {
            System.out.println("poti vizualiza");
        } else {
            System.out.println("nu poti vizualiza");
        }

        //Un student poate sa participe la un curs avansat daca a completat “prerequisites” (adica anumite cursuri anterioare) si daca nota medie in prerequisites este A sau B. Cursul trebuie sa aiba, de asemenea, locuri libere.
        System.out.println("Exercitiul 6");
        System.out.println("Prerequisite completed?");
        boolean hasCompletedPrerequisite = scanner.nextBoolean();
        System.out.println("Completed with grade?");
        String gradeInPrerequisite = scanner.next();
        System.out.println("Are they have open spots?");
        boolean hasOpenSpots = scanner.nextBoolean();
        boolean canTakeCourse = (hasCompletedPrerequisite && (gradeInPrerequisite.equals("A") || gradeInPrerequisite.equals("B") && hasOpenSpots));
        if (hasCompletedPrerequisite && (gradeInPrerequisite.equals("A") || gradeInPrerequisite.equals("B") && hasOpenSpots)) {
            System.out.println("Poti participa");
        } else {
            System.out.println("Nu poti participa");
        }

        //Cream o aplicatie pentru o biblioteca. O carte poate fi imprumutata daca nu este deja imprumutata si daca clientul nu are mai mult de 3 carti imprumutate. In plus, clientul trebuie sa nu aiba deloc datorii
        System.out.println("Exercitiul 7");
        System.out.println("Is the book rented?");
        boolean isBookRented = scanner.nextBoolean();
        System.out.println("How many books did you rented?");
        int n = scanner.nextInt();
        System.out.println("Do you have late fees?");
        boolean hasLateFees = scanner.nextBoolean();
        boolean canRentBook = (!isBookRented && (n < 3) && !hasLateFees);
        if (!isBookRented && (n < 3) && !hasLateFees) {
            System.out.println("You can rent a book");
        } else {
            System.out.println("You cannot rent a book");
        }

        //Un angajat este eligibil pentru o promovare daca lucreza in companie de cel putin 5 ani si scorul de performanta este mai mare decat 8, sau daca are o recomandare de la manager si nu are sanctiuni disciplinare. Totusi, promovarea se poate face doar daca compania nu are promovarile inghetate.
        System.out.println("Exercitiul 8");
        System.out.println("De cati ani lucrati?");
        int yearsWorked = scanner.nextInt();;
        System.out.println("Ce scor de performanta aveti?");
        double performanceScore = scanner.nextDouble();
        System.out.println("Aveti recomandare?");
        boolean hasManagerRecommendation = scanner.nextBoolean();;
        System.out.println("Aveti sanctiuni disciplinare?");
        boolean hasDisciplinaryAction = scanner.nextBoolean();
        System.out.println("Sunt inghetate promovarile in companie?");
        boolean isPromotionFreeze = scanner.nextBoolean();
        boolean isEligibleForPromotion = (((((yearsWorked >= 5) && (performanceScore > 8)) || hasManagerRecommendation) && !hasDisciplinaryAction) && !isPromotionFreeze);
        if (((((yearsWorked >= 5) && (performanceScore > 8)) || hasManagerRecommendation) && !hasDisciplinaryAction) && !isPromotionFreeze) {
            System.out.println("esti eligibil");
        } else {
            System.out.println("Nu esti eligibil");
        }
    }
}