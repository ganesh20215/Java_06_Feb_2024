package variable;

import accessmodifier.DefaultAccessModifier;
import accessmodifier.PublicAccessModifier;

public class OutSideOfClass {

    public static void main(String[] args) {

        //We can access Instance variable outside of the class by creating an object of the class
/*        InstanceVariable instanceVariable = new InstanceVariable();
        System.out.println(instanceVariable.a);*/

        //We can access static variable outside of the class by using class name
//        System.out.println(StaticVariable.b);

        //Static Method
        StaticMethodExample.staticMet();


        //Default Access Modifier
/*        DefaultAccessModifier defaultAccessModifier = new DefaultAccessModifier();
        System.out.println(defaultAccessModifier.s);
        defaultAccessModifier.normalMethod();*/

        //public Access Modifier
/*        PublicAccessModifier publicAccessModifier = new PublicAccessModifier();
        System.out.println(publicAccessModifier.y);
        publicAccessModifier.testMethodCheck();*/
    }
}
