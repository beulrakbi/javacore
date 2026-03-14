package variable;

public class Var10 {
    public static void main(String[] args) {
        /*
        * 변수에는 double, int, short 처럼 타입을 정해줄 수 있다.
        * 그렇다면 리터럴도 정해진 타입이 있어 변수에 잘 넣어줄 수 있다.
        * float의 경우 접미사로 f를 붙인다.
        * long타입은 대문자 L을 접미사로 붙인다.
        *  */
        int a = 100;           // 접미사 필요 없음 (기본 int)
        long b = 100L;         // long 타입 명시
        long c = 3000000000L;  // int 범위를 넘었으므로 L 필수

        float d = 0.1F;        // float 타입 명시 (F 필수)
        double e = 0.1;        // 접미사 생략 (기본 double)

        /*문자의 경우 따옴표로 정의할 수 있다.
        * 'a' 문자의 경우 작은 따옴표
        * 문자열의 경우 " 큰따옴표를 사용한다.*/
        String s = "안녕";
        char g = 'a';
    }
}
