package gun10hs;

public class _01LogicalOperations1 {

    public static void main(String[] args) {

        /*
            return true, false eder.
            int k = a + b;

            veya  --> or --> ||
            birden fazla sart varsa en az birisi true ise sonuc true olur

            ve   --> and -->  &&
            birden fazla sart ifadesinin hepsi true ise true olur

            or ||               and  &&

            1 || 1 = 1          1 && 1 = 1
            1 || 0 = 1          1 && 0 = 0
            0 || 1 = 1          0 && 1 = 0
            0 || 0 = 0          0 && 0 = 0

            1 || 0 || 1 || 0 = 1

         */

        System.out.println(5>1);
        System.out.println(!(5>1));
        System.out.println(2>5);

        System.out.println(5>1 || 2>5);
        // 5>1 = true, 2>5 = false
        // true veya false = true

        System.out.println(5>1 && 2>5);


        /*
            Sart bir kisi
            ya 50 yasindan büyük                        yas
            ya da 30 yasindan kücük ve bayan olacak     yas, cins

            yas>50 || yas<30 && cins='B'

            yas>50 || (yas<30 && cins='B')
            yas>50 || !(yas>=30 || cins!='B')

            yas<30 && (okul==true || calisiyor == true)


            (true || false) == !(false && true)

         */
    }
}
