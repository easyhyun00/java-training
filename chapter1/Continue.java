package chapter1;

public class Continue {
    public static void main(String[] args){
        int sum = 0;
        int num;
        for(num = 1; num<=100; num++){
            if((num % 2) == 0){ // num을 나눈 나머지가 0일 때(짝수) 
                continue; // 수행문 수행하지 않고 증감식 or 조건식으로  
            }
            sum+=num;
        }
        System.out.println(sum);
    }
}
