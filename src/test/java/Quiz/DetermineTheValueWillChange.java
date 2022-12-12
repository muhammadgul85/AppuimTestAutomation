package Quiz;
class A
{
    private int a =1;
    protected int b =2;

}

class B extends A
{
    private int c =3;
    protected int d = 4;

}
public class DetermineTheValueWillChange {
    int score;
    
    public DetermineTheValueWillChange(int score)
    {
      //  score=score; // to assign the value of global variable we have to use keyword this
        this.score=score;
    }

    public static void changeValue(int value)
    {
        value=10;
    }


    public static void main(String[] args) {
        int value = 99;
        changeValue(value);
        System.out.println(value);

        System.out.println("Score of the quiz: " + new DetermineTheValueWillChange(10).score); // to assign the value of global variable we have to use keyword this
        //otherwise 0 will be printed as that's the default value for int



       //new B().a; //a has private access in class A
        System.out.println(new B().b);
    }
}
