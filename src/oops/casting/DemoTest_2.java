package oops.casting;

public class DemoTest_2 extends DemoTestCheck_1 {

    int a = 200;

    @Override
    public void checkMethodTest_2() {
        System.out.println("Demo Test 2 class method check Method Test_2");
    }

    public void childClassMethod() {
        System.out.println("Child Class Method");
    }

    public static void main(String[] args) {
/*        DemoTestCheck_1 demoTestCheck1 = new DemoTestCheck_1();
        System.out.println(demoTestCheck1.a);
        demoTestCheck1.checkMethodTest_1();
        demoTestCheck1.checkMethodTest_2();*/

        //UpCasting
        DemoTestCheck_1 demoTest_2 = new DemoTest_2();
//        System.out.println(demoTest_2.a);
//        demoTest_2.checkMethodTest_2();
        //demoTest_2.childClassMethod();

        //DownCasting
//        DemoTest_2 demoTestCheck_1 = new DemoTestCheck_1();

        DemoTest_2 demoTest2 = (DemoTest_2) demoTest_2;
        System.out.println(demoTest2.a);
        demoTest2.childClassMethod();
    }
}
