package gun40.proje4.TestPackage;

import gun40.proje4.Settings.UserNameAndPassword;
import org.junit.Before;

public class YourTest {

    /*
        before class verilmiştir, değiştirmeyin
        @Before ile belirtilen method testlerden önce otomatik olarak calisir
   */
    @Before
    public void beforeClass(){
        UserNameAndPassword userNameAndPassword = new UserNameAndPassword();
        userNameAndPassword.addUserToList();

    }

    /*
    Test the UserNameAndPassword class setUsername method
    Check all the possible options.
    NOTE :  For each possibility you need to create a different @Test method
    ------------------------------------------------------------------------------
    UserNameAndPassword class setUsername method TEST EDİN
    Bütün ihtimalleri check edin
    NOTE :  Her ihtimal için farklı @Test method oluşturmanız gerekiyor
     */
    //------------------------------------------------------------



   
}
