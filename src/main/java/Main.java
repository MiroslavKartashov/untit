
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
// 1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        GuessTheNumber();
        GuessTheWord();
    }
    public static void GuessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("У Вас всего 3 попытки угадать числo." );
        int range = 9;
        int effort ;   // попытки
        int replay, number = (int) (Math.random() * range);
        for (effort = 1;effort > 0 ; effort++) {
            System.out.println("Введете число от 0 до " + range);
            System.out.println(effort + " -я попытка");
           int inputNumber = scanner.nextInt();
           if (inputNumber == number) {
                System.out.println("Вы выиграли!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет!");
                replay = scanner.nextInt();
                if (replay == 1) GuessTheNumber();
                else System.out.println("Cпасибо, игра закончена");
                break;
            } else if (inputNumber > number)  {
                System.out.println("Загаданное число меньше");
            } else if (inputNumber < number) {
                System.out.println("Загаданное число больше");
            }
            if (effort == 3){
                System.out.println("УППсс  " + effort + " попытки использовано " );
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет!");
                replay = scanner.nextInt();
                if (replay == 1) GuessTheNumber();
                else System.out.println("Cпасибо, игра закончена");
                break;
            }
        }scanner.close();
    }

//* Создать массив из слов
// String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
// "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
// "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
// Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.

    public static void GuessTheWord() {
        Scanner scanner = new Scanner(System.in);
        Random randomValue = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int n = randomValue.nextInt(words.length);
        System.out.println(words[n]);
        System.out.println("Копьютер загадал  слово из списка:" );
        System.out.println(Arrays.toString(words));
        System.out.println("Ваша задача отгадать это слово. ");
        String word;
        String str = "";
        char[] chs = str.toCharArray();
        char[] chCmp = new char[chs.length];
        for (int i = 0; i < chs.length; i++){
         }
         while (true) {
               System.out.println("Введите слово (для ВЫХОДА введите 0 ): ");
               word = scanner.nextLine();
             if (word.equals("0")){
               break;
              }
             if (word.equals(words[n])){
               System.out.println("Вы отгадали слово!  " + word);
               break;
             }else {
                String st = (words[n]);
                char a = st.charAt(0);
                char b = st.charAt(1);
                System.out.println("Вы НЕ угадали! " + a + b + "##########") ;
                System.out.println(String.copyValueOf(chCmp));

            }
         }scanner.close();
    }
}



