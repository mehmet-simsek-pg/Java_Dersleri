package mentoring.Gun02;

public class Loops02 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (j==3){
                    continue;
                }
                System.out.print(i+","+j+" ");
            }
        }
    }
}
