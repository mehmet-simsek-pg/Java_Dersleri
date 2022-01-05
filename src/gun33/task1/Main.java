package gun33.task1;

public class Main {
    /*
    Math sınıfindaki metodları kullanarak
	getMax(x, y);
	getMax(x, y, z); (Math.Max(x,y))
	getMin(x, y);
	getMin(x, y, z);
	getMutlak(x);
	getUs(x, y);
	getKarekok(x);
	getToplam(Type...x),
	getCarpım(Type...x)

	methodlarını kendi oluşturacağınız bir sınıfta yazarak
	mainden nesne oluşturmadan direk
	kullanılmasını sağlatacak örnek kullanımlarını yazınız.
	(kendi metodunuzun içinde
	Math.fonksiyonlarını kullanabilirsiniz)

     */

    public static void main(String[] args) {
        double max = MyMath.getMax(2,6);
        System.out.println(max);

        System.out.println(MyMath.getMin(9, 1, 5));
        System.out.println(MyMath.getToplam(1, 2, 3, 4));
        System.out.println(MyMath.getCarpim(1, 2, 3, 4));


        /*
            4,2,7


         */
        double max1 = MyMath.getMax(4, 2, 7);
        double min1 = MyMath.getMin(4, 2, 7);
        double toplam = MyMath.getToplam(min1, max1);
        System.out.println(toplam);



    }
}
