public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.classes = classes;
        this.average = 0.0;
        this.stuNo = stuNo;
        this.isPass = false;
    }
    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }
    void addVerbalGrade(int vNote1,int vNote2, int vNote3){
        if (vNote1 >= 0 && vNote1 <= 100) {
            this.c1.vNote = vNote1;
        }
        if (vNote2 >= 0 && vNote2 <= 100) {
            this.c2.vNote = vNote2;
        }
        if (vNote3 >= 0 && vNote3 <= 100) {
            this.c3.vNote = vNote3;
        }
        averageCalculator();
    }
    void averageCalculator(){
        this.c1.littleAverage = ((this.c1.vNote)*0.2)+((this.c1.note)*0.8);
        this.c2.littleAverage = ((this.c2.vNote)*0.2)+((this.c2.note)*0.8);
        this.c3.littleAverage = ((this.c3.vNote)*0.2)+((this.c3.note)*0.8);
    }
    void isPass() {
        this.average = (this.c1.littleAverage + this.c2.littleAverage + this.c3.littleAverage) / 3.0;
        if (this.average > 55) {
            System.out.println("Sınıfı Geçtiniz");
            System.out.println("Öğrenci : " + this.name);
            System.out.println("Sınıf : " + this.classes);
            this.isPass = true;
        } else {
            System.out.println("Sınıfta Kaldınız");
            System.out.println("Öğrenci : " + this.name);
            System.out.println("Sınıf : " + this.classes);
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {

        System.out.println(this.c1.name + " Notu :" + this.c1.note + " Sözlü Notu :" + this.c1.vNote + " Ders Ortalaması : " + this.c1.littleAverage);
        System.out.println(this.c2.name + " Notu :" + this.c2.note + " Sözlü Notu :" + this.c2.vNote + " Ders Ortalaması : " + this.c2.littleAverage);
        System.out.println(this.c3.name + " Notu :" + this.c3.note + " Sözlü Notu :" + this.c3.vNote + " Ders Ortalaması : " + this.c3.littleAverage);
        System.out.println("Ortalamanız : " + average);
        System.out.println("====================");

    }
}
