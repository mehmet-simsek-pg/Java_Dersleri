package gun41;

public class _08AndOr {
    public static void main(String[] args) {

        int i = 10;
        int j = 10;

        // short OR
        // sol taraf (i++ > 5) dogru ise sag tarafi (j-- < 5) okumaz,  sonuc degismez
        // sol taraf (i++ > 5) false ise sag tarafi (j-- < 5) okur

        if ( i++ > 5 || j-- < 5 ){
            System.out.println(i + ", " + j );
        }

        if ( i++ < 5 && j-- > 5 ){
            System.out.println(i + ", " + j );
        }else{
            System.out.println(i + ", " + j );
        }



        int a = 10;
        int b = 10;

        // bitwise OR
        // sol taraf (a++ > 5) dogru olsa da sag tarafi (b-- < 5) okur, sagin yanlis olmasi sonucu degistirmez
        if ( a++ > 5 | b-- < 5 ){
            System.out.println(a + ", " + b );
        }else {

        }


        if ( a++ < 5 & b-- > 5 ){
            System.out.println(a + ", " + b );
        }else {
            System.out.println(a + ", " + b );
        }


    }
}
