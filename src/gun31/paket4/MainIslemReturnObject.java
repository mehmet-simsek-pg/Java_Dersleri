package gun31.paket4;

public class MainIslemReturnObject {
    public static void main(String[] args) {
        IslemReturnObject islem = new IslemReturnObject();
        islem
                .set(0)
                .topla(5)
                .topla(1)
                .cikar(3)
                .cikar(1)
                .yaz();

    }
}
