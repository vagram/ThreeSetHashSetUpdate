import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

        public static String regExEmailADD = "([a-z]+)(\\d+)?(@)([a-z]+)(\\.[r][u])?(\\s)(ad{2})";
        public static String regExLIST = "list";
        public static String regExEXIT = "exit";
        public static String regExEDIT = "([a-z]+)(\\d+)?(@)([a-z]+)(\\.[r][u])?(\\s)(edit)";
        public static String input;
        public static boolean isContinue = true;
        public static TreeSet<String> treeSet = new TreeSet<>();
        public static String email;


    public static void main(String[] args) {
        while (isContinue) {
            System.out.println("Введите имэйл и команду:");
            input = new Scanner(System.in).nextLine();
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
            System.out.println(element);
        }
    }
    public static void addEmail(){
        email = input.toLowerCase().replaceAll(regExEmailADD,"$1$2$3$4$5");
        treeSet.add(email);
        print();
    }
    public static void listEmail(){
        if (treeSet.isEmpty()){
            System.out.println("Список имэйлов пуст!");
        }else print();
    }
    public static void editEmail(){
        email = input.toLowerCase().replaceAll(regExEDIT,"$1$2$3$4$5");
        if (treeSet.contains(email)){
            treeSet.remove(email);
            System.out.println("Введите новый имэйл: ");
            input = new Scanner(System.in).nextLine();
            treeSet.add(input);
            System.out.println(input + " - Добавлен!");
        } else System.out.println("Введенного имэйла нет с списке!");
    }
}
