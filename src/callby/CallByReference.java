package callby;

public class CallByReference {

    int data = 100;

    public void show(CallByReference callByReference){
        callByReference.data = callByReference.data + 50;
        System.out.println(data);
    }

    public static void main(String[] args) {
        CallByReference callByReference = new CallByReference();
        System.out.println("Before Calling the method " + callByReference.data);
        callByReference.show(callByReference);              //Call by Reference means calling a method with a parameter as a reference
        System.out.println("After Calling the method " + callByReference.data);
    }
}
