package Generic;

public class GenericCalssWithMultipleParameters <T,V>
{
    private T a1;
    private V a2;
    private int a3;
    private String a4;


    public GenericCalssWithMultipleParameters(T a1, V a2,  int a3, String a4)
    {
        this.a1 =a1;
        this.a2 =a2;
        this.a3 =a3;
        this.a4 =a4;

    }

    public void getValuesF ()
    {
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

    }



}
