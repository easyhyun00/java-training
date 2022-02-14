package chapter1;

public class Break {
    public static void main(String[] args){
        int sum = 0;
        int num = 1;

        while(true){ // 무한 루프
            sum +=num;
            if(sum > 100){ // sum이 100보다 클 경우
                break; // 반복문 빠져나옴
            }
            num++;
        }
        System.out.println(sum);
        System.out.println(num);
    }
}
