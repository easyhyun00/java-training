package chapter1;

public class WhileEx1 {
    public static void main(String[] args){

        int num = 1;
        int sum = 0;

        while( num <= 10 ){ // num이 10 이하일 동안 반복(11이 될 경우 반복문 빠져나옴)
            sum += num; // sum = sum + num
            num++; // num = num + 1
        }
        System.out.println("1부터 10까지 합은 "+sum+"입니다.");
    }
}
