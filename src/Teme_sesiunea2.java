import java.sql.SQLOutput;
import java.util.Scanner;

public class Teme_sesiunea2 {

    /*1. Scrie un program care sa citeasca de la tastatura un mesaj, iar apoi sa afiseze mesajul cu litere mari.
    public static void main(String[] args) {
        System.out.println("Exercitiul 1");
        String cuMajuscule = LitereMari();
        System.out.println(cuMajuscule);
    }

    public static String LitereMari() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduceti cuvantul cu litere mici");
        String cuvant = scanner.nextLine();
        String cuvantCuLitereMari = cuvant.toUpperCase();
        return cuvantCuLitereMari;
    }

    //2. Scrie un program care sa "puna pauza intre cuvinte". Citeste de la tastatura un mesaj si inlocuieste toate spatiile cu "...".
    public static void main(String[] args) {
        System.out.println("Exercitiul 2");
        String modified = textModificat();
        System.out.println("Noul text este: "+modified);
    }

    public static String textModificat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti expresia");
        String expresia = scanner.nextLine();
        String spatiuInlocuit = expresia.replace(" ","...");
        return spatiuInlocuit;
    }

    //3. Scrie un program care sa adauge emoticoane. Citeste de la tastatura un mesaj si inlocuieste toate secventele ":)" cu 🙂 si toate secventele ":(" cu 🙁
    public static void main(String[] args) {
        System.out.println("Exercitiul 3");
        String emoticon = Emoji();
        System.out.println(emoticon);
    }

    public static String Secventa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti secventa");
        String secventa = scanner.nextLine();
        return secventa;
    }

    public static String Emoji() {
        String figura = Secventa();
        String afisat = "";
        if (figura.equals(":)")) {
            afisat = figura.replace(":)", "\uD83D\uDE42");
        } else {
            if (figura.equals(":(")) {
                afisat = figura.replace(":(", "\uD83D\uDE41");
            } else {
                System.out.println("Nu cunoastem secventa");
            }
        }
        return afisat;
    }

    //4. Scrie un program care sa construiasca o adresa de e-mail. Citeste de la tastatura numele si domeniul.
    public static void main(String[] args) {
        System.out.println("Exercitiul 4");
        String mail = email();
        System.out.println(mail);
    }

    public static String email(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele de utilizator");
        String nume = scanner.nextLine();
        System.out.println("Introduceti domeniul");
        String domeniu = scanner.nextLine();
        System.out.println("Introduceti extensia (exemplu: .ro, .com, etc)");
        String extensia = scanner.nextLine();
        String adresa = (nume + "@" + domeniu + extensia);
        return adresa;
    }

    //5. Scrie un program care sa verifice daca un cuvant este intr-un text.
    public static void main(String[] args) {
        System.out.println("Exercitiul 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti expresia");
        String expresie = scanner.nextLine();
        System.out.println("Introduceti cuvantul cautat");
        String cuvant = scanner.nextLine();
        Boolean cuvantGasit = false;
        if(expresie.contains(cuvant)){
            cuvantGasit = true;
        } else{
            cuvantGasit =false;
        }
        if(cuvantGasit = true){
            System.out.println("Cuvantul " +cuvant + " a fost gasit.");
        }else{
            System.out.println("Cuvantul " +cuvant + " nu a fost gasit");
        }

    //6. Scrie scheletul unui program care sa trimita notificari text sau prin e-mail.
    public static void main(String[] args) {
        System.out.println("Exercitiul 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti textul notificarii");
        String text = scanner.nextLine();
        System.out.println("Adresa expeditorului");
        String sender = scanner.nextLine();
        System.out.println("Adresa destinatarului");
        String recepient = scanner.nextLine();
        String notificationText = createNotification(text, sender, recepient);
        sendNotificationText(notificationText);
        sendNotificationEmail(notificationText);
    }

    public static String createNotification(String text, String sender, String recepient) {
        String notificationText = "Mesaj trimis de: " + sender + "\nTextul mesajului este: " + text + "\nExpeditorul mesajului este: " + recepient;
        return notificationText;
    }

    public static void sendNotificationText(String notificationText){
       // String textulNotificariiSMS = createNotification(text, sender, recepient);
        //cod care trimite prin SMS
        System.out.println("Notificarea a fost trimisa prin mesaj\n " + notificationText);

    }

    public static void sendNotificationEmail(String notificationText){
       // String textulNotificariiEmail = createNotification(text, sender, recepient);
        //cod care trimite prin email
        System.out.println("Notificarea a fost trimisa prin e-mail\n " + notificationText);

    }*/



//    7. Creaza un sistem de tracking pentru colete.
//    public static void main(String[] args) {
//        System.out.println("Exercitiul 7");
//        Scanner scanner=new Scanner(System.in);
//        String numarColet = scanner.nextLine();
//        System.out.println(preluare(numarColet));
//        procesare(numarColet);
//        System.out.println(trimitere());
//        System.out.println(livrare());
//    }
//
//
//
//    public static String preluare(String numarColet){
//        String textEtapa1 = "Coletul cu numarul " + numarColet + " este in prelucrare";
//        return textEtapa1;
//    }
//
//    public static void procesare(String numarColet){
//        System.out.println("Coletul cu numarul " + numarColet + " este in procesare");
//
//    }
//
//    public static String trimitere(String numarColet){
//        String textEtapa3 = ("Coletul cu numarul " + numarColet + " este in curs de livrare");
//        return textEtapa3;
//    }
//
//    public static String livrare(String numarColet){
//        String textEtapa4 = ("Coletul cu numarul " + numarColet + " este in curs de livrare");
//        return textEtapa4;
//    }
}
