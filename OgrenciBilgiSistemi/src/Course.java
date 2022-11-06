public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    public void addTeacher(Teacher tutor){
        if(tutor.branch.equals(this.prefix)){
            this.courseTeacher = tutor;
            System.out.println(tutor.name+" Atandı ! \nİşlem Başarılı");
        }else {
            System.out.println(tutor.name + " Bu Dersi Veremez ! ");
        }
    }

    public void printTeacher(){
        if(courseTeacher != null){
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        }else {
            System.out.println(this.name + "dersine Akademisyen atanmamıştır !");
        }
    }
}
