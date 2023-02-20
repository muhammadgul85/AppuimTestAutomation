package Generic;

public class CallObjects {
    public static void main(String[] args) {






        StoreGenericValue<String> stObV = new StoreGenericValue<String>("John Davies");
        StoreGenericValue<Double> stIntObv = new StoreGenericValue<Double>(455.55);
        String personName = stObV.getValue();
        Double rates = stIntObv.getValue();
        System.out.println(personName);
        System.out.println(rates);




        /*

        StoreObjectValues stObValue = new StoreObjectValues("String");
        StoreObjectValues stIntValue = new StoreObjectValues(45);

        String stringValue = (String) stObValue.getValue(); //We are not converting them into Primitive hence using String

        Integer getIntValue = (Integer) stIntValue.getValue();//We are not converting them into Primitive hence using Integer
        System.out.println(stringValue);
        System.out.println(getIntValue);



         */


       /* StoreValue storeIntValue = new StoreValue(33);
        Integer gettingValue = storeIntValue.getValue();
        System.out.println(gettingValue);

        StoreValue storeSalary = new StoreValue(45000.99);
        Double mySalary = storeSalary.getSalary();
        System.out.println(mySalary);

        */
    }
}
