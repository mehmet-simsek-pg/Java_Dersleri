package gun49.ornek3;

public class Soru {

    public static void main(String[] args) {
        BSinifi b = new BSinifi();
        System.out.println(b.degisken+" statik:"+BSinifi.statikDegisken);

        int i = 5;
        i++;  ++i; // i = i + 1;
        i--;  --i; // i = i - 1;
    }
}

class ASinifi
{
    static int statikDegisken = 222;

    int degisken = 111;

    {
        statikDegisken = statikDegisken++ - ++degisken;
    }
}

class BSinifi extends ASinifi
{
    {
        degisken = statikDegisken-- + --degisken;
    }
}