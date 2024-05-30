package superkeyword;

public class TaimurKhan extends SaifAliKhan{
    int money = 200;

    TaimurKhan(int x){
        super(x);           //super() can be parent class constructor.
    }

    @Override
    public void car() {
        System.out.println("TaimurKhan car method");
    }

    public void accessMethodOfParent(){
        System.out.println(super.money);               //Super keyword we can use to call parent class instance variable
        super.car();                                  //super can be used to invoke immediate parent class method.
    }

    public static void main(String[] args) {
        TaimurKhan taimurKhan = new TaimurKhan(100);
        taimurKhan.accessMethodOfParent();
    }
}
