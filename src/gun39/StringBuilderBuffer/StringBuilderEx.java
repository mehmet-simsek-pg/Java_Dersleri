package gun39.StringBuilderBuffer;

public class StringBuilderEx {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Java Dünyasi");
        System.out.println(stringBuilder);
        stringBuilder.append(12);
        stringBuilder.insert(3, "XX");
        System.out.println(stringBuilder);
        stringBuilder.replace(3, 9, "Aaaa");
        System.out.println(stringBuilder);


    }

}

/*
    java 1.5 (1.2) ile geldi
    StringBuffer"a göre daha fazla etkili (efficient)
    coklu kullanima uygun

    Stack,  Heap
 */