package gun33.task3;

public class Main {
    /*
    Üniversitede Öğrencilere Ders kaydı programı yapılmak isteniyor.
    Önce ders tanımlamaları yapılacak, sonra her öğrenci için alabileceği ders saatini geçmeyecek şekilde, dersler
    öğrencilere eklenecek.
    1.	Yeni ders oluşturmak için Lesson adında bir sınıf tanımlayınız :
		fields: name, hour
    2.	3 adet ders tanımlayınız.
		mat101 6 saat,  fiz101 4 saat, java101 6 saat, gibi
    3.	Student isminde yeni bir class tanılayınız:
        fields : name, maxAlabilecegiDersSaatMiktari
    4.	Öğrenci oluşturmayı bir metod ile yazınız.createStudent
    5.	2 adet öğrenci oluşturunuz:
        Adı: Mehmet, maxAlabilecegiDersSaatMiktari=20 olsun
        Adı: Ayşe, maxAlabilecegiDersSaatMiktari=12
    6.	Öğrenciye ders Eklemek için bir dersListesi tutacak bir
		field ekleyiniz: studentLessons adında
    7.	Öğrenciye ders ekleyen LessonAdd isimli bir metod yazınız;
		fakat ders eklenirken toplam ders saat miktarı öğrencinin alabileceği saat
		miktarını aşmasın, aşarsa uyarı versin.
		yani öğrencinin alabileceği max saat miktarına baksın, geçmeyecekse eklesin.
    8.	Her öğreninin aldığı dersleri yazan bir metod yazınız.ve
		dersleri yazdırınız. printLesson
     */

    public static void main(String[] args) {
        Lesson mat101 = new Lesson("Mat101", 6);
        Lesson fiz101 = new Lesson("Fiz101", 4);
        Lesson java101 = new Lesson("Java101", 6);

        Student ali = new Student("Ali", 20);
        Student ayse = new Student("Ayse", 12);

        ali.setLesson(mat101);
        ali.setLesson(fiz101);
        ali.setLesson(java101);

        ayse.setLesson(mat101);
        ayse.setLesson(fiz101);
        ayse.setLesson(java101);

        System.out.println(ali);
        System.out.println(ayse);

    }
}
