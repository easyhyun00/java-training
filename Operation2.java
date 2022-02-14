package chapter1;

public class Operation2 {
    public static void main(String[] args){
        int num1 = (5 > 3)?10:20; // true이므로 num1은 10
        System.out.println(num1);

        int num2 = (5 < 3)?10:20; // false이므로 num2는 20
        System.out.println(num2);
    }
}
