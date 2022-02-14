public class OperatorStudy {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = " + a );    //Java的=符號如果左邊是String的話,會變成StringBuilder的append
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a = 10");
        System.out.println(stringBuilder.toString());

        int b = a++;    //a++代表a+1
        System.out.println("b = a++ : a = " + a + " b = " + b );    //放後面代表是先做完=才做運算
        b = ++a;
        System.out.println("b = ++a : a = " + a + " b = " + b );    //放前面代表先運算在做=
    }
}
