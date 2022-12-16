package Quiz;

public class NestedLoops {
    public static void main(String[] args) {


        int j =5;
        for (int i=1; i<=4; i++)//usual for loop which will execute 4 times, if we remove while and do while loops result will be same
        {
            while (true) // This is true so infinite loop however this will break as given in line 18 and it will execute once only
            {
                do {
                    System.out.print(1); //1 will be printed and we are using print not println, the cursor will not reach new line
                    if (i>1) // whether it's true or false we are not printing anything inside body of condition
                        continue;
                }
                while (false); // Starting point, This is inner loop, executing once as value is false
                break;
            }
        }
    }
}
