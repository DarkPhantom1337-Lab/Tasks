package ua.darkphantom1337.first;

public class First {

    private static String sequence = "gfsfdfgdsdfglsf4g5dg434435@#$,,.^@#)%$";
    private static char[] charSequence = sequence.toCharArray();

    public static void main(String[] args) {
        String nSequence = "";
        for (int i = 0; i < sequence.length(); i++) {
            if (i % 5 == 0) {
                nSequence += charSequence[i];
                System.out.println(i + " sequence symbol: " + charSequence[i]);
            }
        }
        System.out.println("Created sequence: " + nSequence + " Length: " + nSequence.length());
    }

}
