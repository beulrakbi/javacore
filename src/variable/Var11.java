package variable;

public class Var11 {
    public static void main(String[] args) {
        /*
        * 문자열과 결합
        * 모든 타입은 문자열과 결합하면 문자열로 바뀐다. */
        String name = "Ja" + "va";
        String str = name + 8.0;
        System.out.println(name);
        System.out.println(str);
        System.out.println(7+""); //숫자 7을 문자열로 바꿀 때 그냥 빈 문자열 더해주면 됨
        System.out.println(""+7);
        System.out.println(""+"");
    }
}
