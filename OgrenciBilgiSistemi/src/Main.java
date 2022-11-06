public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca","123","TRH");
        Teacher t2 = new Teacher("Nikola Tesla","245","FZK");
        Teacher t3 = new Teacher("Albert Einstein","852","MAT");

        Course tarih = new Course("Tarih","trh101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","fzk102","FZK");
        fizik.addTeacher(t2);

        Course matematik = new Course("Matematik","mat103","MAT");
        matematik.addTeacher(t3);

        Student s1 = new Student("Acun Ilıcalı","1","4",tarih,fizik,matematik);
        s1.addBulkExamlNote(30,40,80);
        s1.addBulkVerbalNote(70,55,90);
        s1.isPass();

        Student s2 = new Student("Hande Yener","2","2",tarih,fizik,matematik);
        s2.addBulkExamlNote(95,80,60);
        s2.addBulkVerbalNote(60,70,90);
        s2.isPass();

        Student s3 = new Student("Müslüm Gürses","4","3",tarih,fizik,matematik);
        s3.addBulkVerbalNote(50,60,100);
        s3.addBulkExamlNote(40,40,60);
        s3.isPass();

    }
}
