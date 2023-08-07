package Reluare_teme_Array;

import java.util.Scanner;

public class Pb15Array {
    //15. Scrie un program care sa evalueze automat raspunsurile date de un student la un quiz.
    //Ca si input (pe care il poti hardcoda initial) vei avea raspunsurile corecte si raspunsurile date de student. /De exemplu, pentru:
    //
    //studentAnswers : {"C", "D", "D", "B", "A", "C", "B"}
    //teachersAnswers : {"A", "D", "D", "B", "B", "C", "B"}
    //functia va returna 5, deoarece sunt 5 raspunsuri care corespund, la indecsii 1,2,3,5,6.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] teacherAnswer = new String[7];
        String[] studentAnswer = new String[7];
        int counter = 0;
        System.out.println("introduceti raspunsurile profesorului");
        for(int i = 0; i < teacherAnswer.length; i++){
            teacherAnswer[i] = scanner.nextLine();
        }
        System.out.println("introduceti raspunsurile studentului");
        for(int i = 0; i < studentAnswer.length; i++){
            studentAnswer[i] = scanner.nextLine();
        }
        for(int i = 0; i < studentAnswer.length; i++){
            if(studentAnswer[i].equals(teacherAnswer[i])){
                counter = counter + 1;
            }
        }
        System.out.println("numarul de raspunsuri corecte este: " + counter);

    }
}
