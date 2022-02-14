package chapter1;

public class GugudanFor {
    public static void main(String[] args){
        int dan;
        int times;
        for(dan=2; dan<=9; dan++){ // 2단부터 9단까지 +1
            for(times=1;times<=9;times++){ // 1부터 9까지 곱하는 수
                System.out.println(dan+" X "+times+" = "+dan*times);
            }
            System.out.println(); // 한 줄 띄기
        }
    }
}
