package chapter1;

public class Constant {
    public static void main(String[] args){
        final int MAX_NUM = 100;
        final float PI = 3.14F;

        // MAX_NUM = 101; // 수정할 수 없다.
        // PI = 3.15F; // 수정할 수 없다.

        System.out.println(MAX_NUM);
        System.out.println(PI);
    }
}
