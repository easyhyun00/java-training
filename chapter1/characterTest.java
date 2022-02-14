package chapter1;

public class characterTest {
    public static void main(String[] args){
        char ch = 'A'; // char 변수형 ch에 문자 A 저장

        System.out.println(ch); // 결과: A
        System.out.println((int)ch); // 결과: 65(A의 아스키코드 값)

        ch = 66; // char 변수형 ch에 66(B의 아스키코드 값)저장

        System.out.println(ch); // 결과: B
    }
}
