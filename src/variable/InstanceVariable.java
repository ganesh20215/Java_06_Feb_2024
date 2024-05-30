package variable;

public class InstanceVariable {
    int a = 100;        //Instance Variable //Global variable //Created in Heap memory

    public void test(){

    }

    public static void main(String[] args) {
        InstanceVariable instanceVariable = new InstanceVariable();
        InstanceVariable instanceVariable1 = new InstanceVariable();
        InstanceVariable instanceVariable2 = new InstanceVariable();
        InstanceVariable instanceVariable3 = new InstanceVariable();
        InstanceVariable instanceVariable4 = new InstanceVariable();
        System.out.println(instanceVariable.a);

        System.out.println(instanceVariable1.a);
        System.out.println(instanceVariable2.a);
        System.out.println(instanceVariable3.a);
        System.out.println(instanceVariable4.a);
    }
}
