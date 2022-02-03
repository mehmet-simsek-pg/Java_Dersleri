package gun54.paket4;

import java.util.ArrayList;

public class NanAccess {

    final static int a = 1;
    final int b = 2;
    final int bb;
    final int cc;
    final ArrayList<Integer> list = new ArrayList<>();


    {
        cc = 3;
    }

    public NanAccess() {
        bb = 10;

    }

    public void deneme(){
        //b = 2;
        list.add(1);
        //list = new ArrayList<>();
    }
}
