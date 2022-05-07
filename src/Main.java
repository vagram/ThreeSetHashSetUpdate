import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

<<<<<<< HEAD
        public static String regExEmailADD = "([a-z]+)(\\d+)?(@)([a-z]+)(\\.[r][u])?(\\s)(ad{2})";
        public static String regExLIST = "list";
        public static String regExEXIT = "exit";
        public static String regExEDIT = "([a-z]+)(\\d+)?(@)([a-z]+)(\\.[r][u])?(\\s)(edit)";
=======
        public static final String regExADD = "(ad{2})";
        public static final String regExLIST = "list";
        public static final String regExEXIT = "exit";
        public static final String regExEDIT = "(edit)";
        public static final String regExEMAIL = "([a-z]+)(\\d+)?(@)([a-z]+)(\\.([r][u]|[c][o][m]))?(\\s)?";
>>>>>>> Initial commit
        public static String input;
        public static boolean isContinue = true;
        public static TreeSet<String> treeSet = new TreeSet<>();
        public static String email;


    public static void main(String[] args) {
        while (isContinue) {
            System.out.println("Введите имэйл и команду:");
            input = new Scanner(System.in).nextLine();
<<<<<<< HEAD
            if (input.toLowerCase().matches(regExEmailADD) ) {
                addEmail();
            } else if (input.toLowerCase().matches(regExLIST)){
                listEmail();
            }else if (input.toLowerCase().matches(regExEDIT)){
                editEmail();
            }else if (input.toLowerCase().matches(regExEXIT)){
                isContinue = false;
            }
            else System.out.println("Формат имэйла Неправильный!");
        }
    }
    public static void print(){
        for (String element: treeSet){
=======
            if (input.toLowerCase().matches(regExEMAIL + regExADD)) {
                addEmail();
            } else if (input.toLowerCase().matches(regExLIST)) {
                listEmail();
            } else if (input.toLowerCase().matches(regExEMAIL + regExEDIT)) {
                editEmail();
            } else if (input.toLowerCase().matches(regExEXIT)) {
                isContinue = false;
            } else System.out.println("Формат имэйла Неправильный!");
        }
    }

    public static void print() {
        for (String element : treeSet) {
>>>>>>> Initial commit
            System.out.println(element);
        }
    }
    public static void addEmail(){
<<<<<<< HEAD
        email = input.toLowerCase().replaceAll(regExEmailADD,"$1$2$3$4$5");
        treeSet.add(email);
        print();
=======
        email = input.toLowerCase().replaceAll(regExADD,"");
        treeSet.add(email);
        System.out.println(email + "Был добавлен!");
>>>>>>> Initial commit
    }
    public static void listEmail(){
        if (treeSet.isEmpty()){
            System.out.println("Список имэйлов пуст!");
        }else print();
    }
    public static void editEmail(){
<<<<<<< HEAD
        email = input.toLowerCase().replaceAll(regExEDIT,"$1$2$3$4$5");
        if (treeSet.contains(email)){
            treeSet.remove(email);
            System.out.println("Введите новый имэйл: ");
            input = new Scanner(System.in).nextLine();
            treeSet.add(input);
            System.out.println(input + " - Добавлен!");
=======
        email = input.toLowerCase().replaceAll(regExEDIT,"");
        if (treeSet.contains(email)){
            System.out.println("Введите новый имэйл: ");
            input = new Scanner(System.in).nextLine();
            if (input.matches(regExEMAIL)) {
                treeSet.remove(email);
                treeSet.add(input);
                System.out.println(input + " - ИзменЁн!");
            }else System.out.println("Формат имэйла Неправильный!");
>>>>>>> Initial commit
        } else System.out.println("Введенного имэйла нет с списке!");
    }
}
