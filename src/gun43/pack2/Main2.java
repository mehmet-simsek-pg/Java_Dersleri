package gun43.pack2;


import gun43.pack1.Otomobil;

public class Main2 {
    public static void main(String[] args) {
        Otomobil o = new Otomobil();
        o.publicVar = "1";
        //o.protectedVar = "2"; Otomobil farkli class"da (Main2) create edildi.
        //o.defaultVar = "3";
        //o.privateVar = "3";  -> ulasilamaz
        o.publicMethod();
        //o.protectedMethod();
        //o.defaultMethod();

    }


}
