package gun50.proje6Solutions.testClass;

import gun50.proje6Solutions.lessons.LessonClass;
import gun50.proje6Solutions.lessons.Music;
import gun50.proje6Solutions.student.StudentClass;


public class MainClass4 {
    public static void main(String[] args) {

        StudentClass studentClass = new StudentClass("David", "Villa","England" );

        LessonClass lessonClass = new Music(studentClass);

        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

        System.out.println(studentClass);


        /*

        Run the MainClass4

        Result should be
         Exception in thread "main" java.lang.AssertionError: Not able to find a username and password. Please sign up to website

         */
    }
}




