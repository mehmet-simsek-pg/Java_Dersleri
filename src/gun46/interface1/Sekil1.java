package gun46.interface1;

public class Sekil1 implements ICizilebilir{
    @Override
    public void ciz() {
        say(10);
    }

    public void say(int num){
        for (int i = 0; i < num; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
