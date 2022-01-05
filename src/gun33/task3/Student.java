package gun33.task3;

import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;
    ArrayList<Lesson> lessons; //  = new ArrayList<>();

    public Student(String name, int maxCredit) {
        this.name = name;
        this.maxCredit = maxCredit;
        lessons = new ArrayList<>();
    }

    public void setLesson(Lesson lesson){
        if (getTotalCredit() + lesson.hour <= maxCredit)
            lessons.add(lesson);
        else
            System.out.println("Kredi Fazlasi nedeni ile " + lesson.name + " dersi " + name + " icin eklenmedi " );
    }

    public int getTotalCredit(){
        int crd = 0;
        for (Lesson lesson : lessons) {
            crd += lesson.hour;
        }
        return  crd;
    }

    @Override
    public String toString() {
        return "Adi : " + name +
                "\nmaxCredit : " + maxCredit +
                "\nTotal Credit : " + getTotalCredit() +
                "\nlessons : " + lessons;
    }
}
