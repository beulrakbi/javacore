package variable;

public class Var6 {
    public static void main(String[] args) {
        int a;
//        System.out.println(a); 변수를 초기화 하지 않고 사용하면 에러가 발생한다.
        a = 1;
        System.out.println(a);
        System.out.println(a);

        //컴파일 에러 컴파일러가 초기화 안된 a를 잡아냄
    }
}
