package gun55.abstract2;

public class Chrome extends Driver{


    public Chrome(String isim) {
        super(isim);
    }

    @Override
    public String getDriver() {
        return "Chrome Driver";
    }


}
