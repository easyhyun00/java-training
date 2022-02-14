package chapter1;

public class IfExample2 {
    public static void main(String[] args){
        int age = 9;
        int charge = 0;
        
        if(age < 8){ // 8살 미만
            charge = 1000;
            System.out.println("미취학 아동입니다.");
        }
        else if(age < 14){ // 14살 미만
            charge = 2000;
            System.out.println("초등학생입니다.");
        }
        else if(age < 20){ // 20살 미만
            charge = 2500;
            System.out.println("중,고등학생입니다.");
        }
        else{ // 그 외의 경우
            charge = 3000;
            System.out.println("성인입니다.");
        }
        System.out.println("입장료는 "+charge+"원 입니다.");
    }
}
