package gun42.extend1;

public class Main {

    public static void main(String[] args) {
        Hayvan h = new Hayvan();

        Kopek ko = new Kopek();
        ko.yemekYe();

        Kedi ke = new Kedi();
        ke.yas = 10;
        ke.asiVarmi = true;
        ke.yemekYe();
        ke.miyavla();

    }

}
