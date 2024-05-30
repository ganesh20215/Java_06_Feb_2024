package callby;

public class CallByValue {

    int data = 100;

    public void show(int data){
        data = data + 50;
        System.out.println(data);
    }

    public static void main(String[] args) {
        CallByValue callByValue = new CallByValue();
        System.out.println("Before Calling the method " + callByValue.data);
        callByValue.show(400);              //method passing a value, it is known as call by value.
        System.out.println("After Calling the method " + callByValue.data);
    }
}
