package gun55.abstract2;

public class Main {


    public static void main(String[] args) {

        Chrome chrome = new Chrome("Chrome");
        Firefox firefox = new Firefox("Firefox");

        System.out.println(chrome.getDriver());
        System.out.println(firefox.getDriver());

    }
}
