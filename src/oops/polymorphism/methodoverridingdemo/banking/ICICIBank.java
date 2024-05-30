package oops.polymorphism.methodoverridingdemo.banking;

public class ICICIBank extends ReservedBankOfIndia{

    @Override
    public float roiForHomeLoan() {
        return 8.6f;
    }
}
