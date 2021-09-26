package Exception;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

//class A {
//    public void fun1() {
//        System.out.println("A");
//    }
//}
//
//class B extends A {
//    @Override
//    public void fun1() {
//        System.out.println("B");
//    }
//}

class CustomException extends Exception {
    String str = "Okay eta custom class";
    @Override
    public String getMessage() {
        return str;
    }
}

public class ExceptionTest {
    public void fun1() throws Exception {
        Scanner scn = new Scanner(System.in);;
        int num = scn.nextInt();
        int div = scn.nextInt();

        int res = -1;
        try {
            res = num / div;
            throw new CustomException();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
