package gun50.proje6.student;

import gun50.proje6.data.StudentData;
import gun50.proje6.school.SchoolLocation;

import java.util.LinkedHashMap;


public class StudentClass extends SchoolLocation {

  /*
    This class is child of the SchoolLocation
    Create 3 private instance variables
    String username and password
    Linked hash map key is String value is Integer name is classNameAndScore
    ------------------------------------------------------------------------------
    Bu sınıf   SchoolLocation sınıfının child sınıfıdır
    3 private instance variables oluşturun
    String username and password
    Linked hash map , key  String ve  value Integer ,  ismi  classNameAndScore
    */
    //-------------------------------------------------------------------------------------------------------





     /*
        Create an constructor
        three parameter String username, String password and  String studentSchoolLocation
        Call the setUsernameAndPassword method in the constructor
        ------------------------------------------------------------------------------
         String username, String password ve String studentSchoolLocation parametreleri olan constructor oluştur.
         constructor içinde setUsernameAndPassword methodunu çağır
     */
    //-------------------------------------------------------------------------------------------------------




    /*
    Create a method name is  setUsernamePassword
    Parameter is String username and String  password
    no return type
    Check if given username and password pair exist in the StudentData class
    You will use AddUserNameAndPassword method to check it(create a new LinkedHashMap and make it equal to AddUserNameAndPassword from the StudentData class)
    if the pair exists,  make instance variable username equal to parameter username, and make instance variable password equal to parameter password

    if it doesn't not exist then throw an RunTimeException which is "Not able to find a username and password. Please sign up to website"

     ------------------------------------------------------------------------------
        Parametreleri  String username ve  String  password olan ,
        return türü olmayan setUsernamePassword isimli methodu oluşturun
        StudentData sınıfında verilen kullanıcı adı ve parola çifti olup olmadığını kontrol edin
        Kontrol etmek için AddUserNameAndPassword methodunu kullanacaksınız
        (yeni bir LinkedHashMap oluşturun ve StudentData sınıfından AddUserNameAndPassword ile eşit yapın)
        çift varsa, instance variable username ile  parameter username eşitle,
        ve instance variable password ile parameter password eşitle
        Eğer çift yoksa   "Not able to find a username and password. Please sign up to website" olan RunTimeException fırlat
     */
    //-------------------------------------------------------------------------------------------------------





    /*

        classNameAndScore için set methodunu oluşturun
     */

    //-------------------------------------------------------------------------------------------------------







     /*
        classNameAndScore için get methodunu oluşturun
     */
    //-------------------------------------------------------------------------------------------------------






    /*
    Create a toString method
    print username
          password
          Price
          schoolLocation
          ClassNameAndScore
     ------------------------------------------------------------------------------
     toString method  oluşturun
    print username
          password
          Price
          schoolLocation
          ClassNameAndScore
     */
    //-------------------------------------------------------------------------------------------------------





}
