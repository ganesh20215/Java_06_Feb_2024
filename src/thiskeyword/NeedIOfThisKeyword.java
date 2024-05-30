package thiskeyword;

public class NeedIOfThisKeyword {

    int x, y;

    NeedIOfThisKeyword(int x, int y){
        x = x;
        y = y;
    }

    public void show(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {

        NeedIOfThisKeyword needIOfThisKeyword = new NeedIOfThisKeyword(100, 200);
        needIOfThisKeyword.show();
    }
}
