package gun33.task3;

public class Lesson {
    String name;
    int hour;
    public Lesson(String name, int hour) {
        this.name = name;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return name + "-" + hour;
    }
}
