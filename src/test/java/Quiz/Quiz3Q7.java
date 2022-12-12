package Quiz;

public class Quiz3Q7 {
    public static void main(String[] args) {
        /*
        x=1 initiliased
        no of iterations will be there as given in while condition
        catch is y=2;  in each iteration y=2 will be initiliased and it will die/garbage collection as this is local var
        and separate copy of y=2 will be generated in each iteration
        System.out.println(y++); We displaying value of y and increasing value by 1
        But once the iteration is over the local copy of Y will die and a new copy of Y will be generated and inititialised to 2
        so it wouldn't affect the program and value of y will be 2

         */
        int x =1;
        do {
            int y =2;
            x++;
            System.out.println(y++);
        }
        while (x<=3);


        do {
            System.out.println("Hello World");
        }
        while (true); //this will go into infinite loop as condition is true
        //Do while loop when you want the statement to be executed at least once


    }
}
