package variable;

public class Var12 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        /*
        * x와 y의 값을 바꾸려면 새로운 변수를 만들면 간단하게 바꿀 수 있다.*/
        int temp = x;
        x= y;
        y=temp;
        System.out.println(x);
        System.out.println(y);
    }
}
