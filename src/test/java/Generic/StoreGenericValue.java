package Generic;
/*
Generic Class in Java we can type parameterized Class/Interface/Method
A Generic type is a Generic Clas or Interface that is paramterized over types
So whatever the values we provide in Class/Interface type it will behave like the TYPE of VALUE provided
Generic is TYPE SAFE
It Eliminates Runtime Exceptions -
No Explicit Type CASTING required
Instead of Gul you can use Common keywords - T , E , V, K, N
T = Type , E= Element, N=Number, V= Value, K=key

 */
public class StoreGenericValue <Gul>{
    private Gul value;

    public StoreGenericValue(Gul value)
    {
        this.value = value;
    }

    public Gul getValue()
    {
        return value;
    }


}
