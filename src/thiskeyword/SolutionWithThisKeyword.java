package thiskeyword;

public class SolutionWithThisKeyword {

    int x, y;

    SolutionWithThisKeyword(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void show(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {

        SolutionWithThisKeyword solutionWithThisKeyword = new SolutionWithThisKeyword(100, 200);
        solutionWithThisKeyword.show();
    }
}
