package Loop;
//1 <= n <= 20
public class SwitchTest {
    public static void fun(String str) {
//        str.equals("Rimpa");

        switch (str.charAt(1)) {
            case 'i':
                System.out.println("YES");
                break;
            case 'a':
                System.out.println("NO");
                break;
            default:
                System.out.println("HEHE");
        }


//        if(n == 1) {
//            System.out.println("one");
//        } else if (n == 2) {
//            System.out.println("two");
//        } else if (n == 3) {
//            System.out.println("three");
//        } else if (n == 4) {
//            System.out.println("four");
//        } else {
//            System.out.println("five");
//        }

    }
}
