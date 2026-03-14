package operator;

public class Operator1 {
    public static void main(String[] args) {
        //변수 초기화
        int a =5;
        int b = 2;

        //덧셈
        int sum = a+b;
        System.out.println("a+b = " + sum);
        //뺄셈
        int diff = a-b;
        System.out.println("a-b = " + diff);

        //곱셈
        int multi = a*b;
        System.out.println("multi = " + multi);

        //나눗셈
        int div = a/b;
        System.out.println("div = " + div);

        //나머지
        int mod = a%b;
        System.out.println("mod = " + mod);

        //int z = 10/0; //by Zero 0으로 나눌 수 없음
    }
}
