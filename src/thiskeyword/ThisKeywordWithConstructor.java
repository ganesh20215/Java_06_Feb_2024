package thiskeyword;

public class ThisKeywordWithConstructor {

    ThisKeywordWithConstructor(){
        this(10);
        System.out.println("This is a default constructor");
    }

    ThisKeywordWithConstructor(int a){
        this(100, 200);
        System.out.println("This is a default constructor " + a);
    }

    ThisKeywordWithConstructor(int b, int c){
        this(400, 500, 600);
        System.out.println("This is a default constructor " + b + " " + c);
    }

    ThisKeywordWithConstructor(int x, int y, int z){
        System.out.println("This is a default constructor " + x + " " + y + " "+ z);
    }


    public static void main(String[] args) {
        ThisKeywordWithConstructor thisKeywordWithConstructor = new ThisKeywordWithConstructor();
    }
}
