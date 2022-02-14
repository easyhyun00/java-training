package chapter1;

public class Operation {
    public static void main(String[] args){
        int num1 = 10;
        int i = 2;

        // 앞에 (num1 = num1 + 10) < 10 이 false 이며, 
        // && 논리연산자는 하나라도 false면 그 뒤는 볼 필요 없이 false라 평가할 필요가 없어
        // (i = i + 2) > 10 이 문장은 실행되지 않는다.
        boolean value1 = ( ((num1 = num1 + 10) < 10) && ((i = i + 2) > 10) );
        System.out.println(value1);
        System.out.println(num1);
        System.out.println(i);

        // 앞에 (num1 = num1 + 10) > 10 이 true 이며,
        // || 논리연산자는 하나라도 true이면 그 뒤는 볼 필요 없이 true라 평가할 필요가 없어
        // (i = i + 2) > 10 이 문장은 실행되지 않는다.
        boolean value2 = ( ((num1 = num1 + 10) > 10) || ((i = i + 2) > 10) );
        System.out.println(value2);
        System.out.println(num1);
        System.out.println(i);
    }
}
