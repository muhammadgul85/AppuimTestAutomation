package Generic;

public class CallingGenericWithMultipleParameters {
    public static void main(String[] args) {
        GenericCalssWithMultipleParameters<Double, Float> genericObj = new GenericCalssWithMultipleParameters<Double, Float>(44.44, 3.33f, 43,"Gul");
        genericObj.getValuesF();
    }
}
