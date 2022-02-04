package gun55.abstract2;

public class Firefox extends Driver{
    public Firefox(String isim) {
        super(isim);
    }

    @Override
    public String getDriver() {
        return "Firefox Driver";
    }
}
