public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(salary <= 1000){
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public int bonus(){
        if(workHours > 40){
            return (workHours - 40) * 30;
        }else {
            return 0;
        }
    }

    public double raiseSalary(){
        if(hireYear <=0 || hireYear > 2021){
            System.out.println("Geçersiz Değer Girdiniz,Lütfen Kontrol Ediniz.");
        }else{
            int experience = 2021 - hireYear;
            if(experience < 5) return salary * 0.05;
            if(experience > 9 && experience < 20) return salary * 0.10;
            if(experience > 19) return salary * 0.15;
        }
        return 0;
    }

    @Override
    public String toString() {

        double totalSalary = salary - tax() + bonus() + raiseSalary();
        double total       = salary - tax() + bonus();

        return  "Adı : " + name + '\n' +
                "Maaşı : " + salary + '\n' +
                "Çalışma Saati : " + workHours + '\n' +
                "Başlangıç Yılı : " + hireYear + '\n' +
                "Vergi : " + tax() + '\n' +
                "Bonus : " + bonus() + '\n' +
                "Maaş Artışı : " + raiseSalary() + '\n' +
                "Vergi ve Bonuslar ile Birlikte Maaş : " + total + '\n' +
                "Toplam Maaş : " + totalSalary;
    }
}
