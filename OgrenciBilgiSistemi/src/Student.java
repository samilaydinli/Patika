public class Student {
    Course tarih;
    Course fizik;
    Course matematik;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String classes, String stuNo, Course tarih, Course fizik, Course matematik){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.tarih = tarih;
        this.fizik = fizik;
        this.matematik = matematik;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkVerbalNote(int verbalMat, int verbalFizik, int verbalTarih){
        if(verbalMat >=0 && verbalMat <=100){
            this.matematik.verbalNote = verbalMat;
        }
        if(verbalFizik >=0 && verbalFizik <=100){
            this.fizik.verbalNote = verbalFizik;
        }
        if(verbalTarih >=0 && verbalTarih <=100){
            this.tarih.verbalNote = verbalTarih;
        }
    }

    public void addBulkExamlNote(int matematik, int fizik, int tarih){
        if(matematik >=0 && matematik <=100){
            this.matematik.note = matematik;
        }
        if(fizik >=0 && fizik <=100){
            this.fizik.note = fizik;
        }
        if(tarih >=0 && tarih <=100){
            this.tarih.note = tarih;
        }
    }

    public void isPass(){
        if((this.matematik.note == 0 || this.matematik.verbalNote == 0) || (this.fizik.note == 0 || this.fizik.verbalNote == 0) || (this.tarih.note == 0 || this.tarih.verbalNote == 0)){
            System.out.println("Notlar tam olarak girilmemiş!");
        }else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if(this.isPass){
                System.out.println("Sınıfı Geçti");
            }else{
                System.out.println("Sınıfta Kaldı!");
            }
        }
    }

    public void calcAverage(){
        double fizikAverage = this.fizik.note*0.80 + this.fizik.verbalNote*0.20;
        double tarihAverage = this.tarih.note*0.80 + this.tarih.verbalNote*0.20;
        double matematikAverage = this.matematik.note*0.80 + this.matematik.verbalNote*0.20;
        double grade = (fizikAverage + tarihAverage + matematikAverage) / 3.0;
        this.average = Math.round(grade*100)/100.0;
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("==================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik   , Sınav Notu : " + this.matematik.note +    "   | Sözlü Notu : "+this.matematik.verbalNote);
        System.out.println("Fizik       , Sınav Notu : " + this.fizik.note +        "   | Sözlü Notu : "+this.fizik.verbalNote);
        System.out.println("Tarih       , Sınav Notu : " + this.tarih.note +        "   | Sözlü Notu : "+this.tarih.verbalNote);
    }
}
