package oops.abstraction.interfaceexamples.needofdefaultMethod;

public class Iphone implements Mobile{
    @Override
    public void feature() {

    }

    @Override
    public void color() {

    }

    @Override
    public void look() {

    }

    @Override
    public void camera() {

    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.refreshRate();
        Mobile.staticMethod();
    }
}
