package chapter1;

public class IfExample1 {
    public static void main(String[] args){
        int age = 2;
        if(age >= 8 ){ // age가 8보다 크거나 같은 경우
            System.out.println("학교에 다닙니다.");
        }
        else{ // 그 외의 경우(age가 8보다 작은 경우)
            System.out.println("학교에 다니지 않습니다.");
        }
    }
}
