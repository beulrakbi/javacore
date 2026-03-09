package variable;

public class Var2 {
    public static void main(String[] args) {
        int a; // 변수 선언 ( 숫자를 담을 수 있는 통)
        a = 10; // 변수 초기화 (a그릇에 10을 넣어줌)

        System.out.println(a); //숫자 10을 출력
        System.out.println(a);
        System.out.println(a);

        //숫자를 10씩 3번을 출력하고 있는데 20을 3번 출력하라고 요구사항이 바뀌었을 때

        //변수 값만 바꾸면 코드 하나로 수정 가능
        a= 20;
        System.out.println("a = " + a);
        System.out.println("a = " + a);
        System.out.println("a = " + a);
    }
}
