package chapter1;

public class ForEx1 {
    public static void main(String[] args){

        int num;
        int sum = 0;

        for(num=1; num<=10; num++){ // num이 1부터 10까지, num을 하나씩 증가시킴
            sum += num;
        }
        System.out.println("1부터 10까지 합은 "+sum+"입니다.");
    }
}
