package oops.polymorphism.methodoverridingdemo.banking;

public class SBI extends ReservedBankOfIndia{

    @Override
    public float roiForHomeLoan() {
        return 8.5f;
    }
}
