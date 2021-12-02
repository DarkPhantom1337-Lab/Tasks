package ua.darkphantom1337.third;

public class Third {

    private static String overLengthText = "Чертяка Черт чертила даываывдлжвапчертфваыаваыплчерт ываловапчервыаплопвадж четр";

    public static void main(String[] args) {
        System.out.println(overLengthText.toLowerCase().replace("черт", "####"));
    }
}
