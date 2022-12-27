package Quiz;

public class ReplaceCharactersFromStringg {
    public static void main(String[] args) {
       String ssd=  "Mu*#$hammad Gul Mahs123ood";
        System.out.println(ssd);

        String ef = ssd.substring(0,2);
        String gh = ssd.substring(5,20);
        String ij = ssd.substring(23,26);
        System.out.println(ef+gh+ij);

        System.out.println(ssd.replaceAll("[#$123*]*", ""));

    }
}
