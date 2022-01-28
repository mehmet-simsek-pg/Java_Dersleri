package gun50.proje6.testClass;

import gun50.proje6.lessons.*;
import gun50.proje6.student.StudentClass;

import java.util.Scanner;

public class MainClass5 {
    public static void main(String[] args) {

/* Test icin bu satiri silin --------------------------------------------

        StudentClass studentClass = new StudentClass("VanDijk", "Defend04","USA" );

        LessonClass lessonClass = new Music(studentClass);


        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

        System.out.println(studentClass);

        boolean diffTopics=true;

        while(diffTopics){
            Scanner scan = new Scanner(System.in);

            System.out.println("Do you want to see the curriculum : YES OR NO");
            String doUwanasi = scan.nextLine();

            if(doUwanasi.equalsIgnoreCase("yes")){
                System.out.println("which class curriculum you would like to see?");
                String className = scan.nextLine();

                if(className.equals("Math")){
                    LessonClass lessonClass2 = new Mathematics(studentClass);
                    System.out.println(((Mathematics)lessonClass2).topics());
                }else if(className.equals("Biology")){
                    LessonClass lessonClass2 = new Biology(studentClass);
                    System.out.println(((Biology) lessonClass2).topics());
                }else if(className.equals("Chemistry")){
                    LessonClass lessonClass2 = new Chemistry(studentClass);
                    System.out.println(((Chemistry) lessonClass2).topics());
                }else if(className.equals("Music")){
                    LessonClass lessonClass2 = new Music(studentClass);
                    System.out.println(((Music) lessonClass2).topics());
                }else if(className.equals("Science")){
                    LessonClass lessonClass2 = new Science(studentClass);
                    System.out.println(((Science) lessonClass2).topics());
                }else{
                    System.out.println("This is not a valid class name.");
                }

            }else{
                System.out.println("Thanks for choosing your classes see you never :D");
                diffTopics=false;
            }

        }
---- Test icin bu satiri silin */
    }

            /*
        MainClass5  run edin
        Enter: Math
        Enter: Biology
        Enter: Biology

        NOTE : sonuc asagidaki gibi olmali
         You already took this class please choose other class

        Enter: Chemistry
        Enter: Music

        Note : sonuc asagidaki gibi olmali
       StudentClass{username='VanDijk', password='Defend04'Price of the school is $8000Location of the school is USAClass names and score for it {Math=80, Biology=79, Chemistry=13, Music=87}}

        Enter: yes
        Enter: Math

        Note : sonuc asagidaki gibi olmali
        [Place Value, Compare Whole Numbers, Represent Decimals, Place Value through Thousandths, Multiplication Patterns]

        Enter: no

         */
}



