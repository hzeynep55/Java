public class Employee {
    String name;
    int salary;
    int workhours;
    int hireYear;

    Employee(String name,int salary,int workhours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workhours=workhours;
        this.hireYear=hireYear;
        bonus();


    }

    double tax(){
        double vergi=0;
        if(this.salary<1000){
            vergi=0;

        }
        else{
            vergi=this.salary*0.03;

        }
        return vergi;


    }
    double bonus(){
        double bonus=0;
        if(this.workhours>40){
            bonus=(this.workhours-40)*30;
        }
        else{
            bonus=0;
        }
        return bonus;
    }

    double  raiseSalary(){
        double zam=0;
        int year=2021-this.hireYear;
        if(year<10){
            zam=this.salary*0.05;

        }
        else if(year>9&& year<20){
            zam=this.salary*0.10;


        }
        else {
            zam=this.salary*0.15;
        }

            return zam;
    }

     void tostring(){
        System.out.println("---------------------------------");
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workhours);
        System.out.println("Başlangış Yılı: "+this.hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş Artışı: "+raiseSalary());
        System.out.println("Vergi ve Bonuslarla Maaş: "+(tax()+bonus()));
        System.out.println("Toplam Maaş: "+(this.salary+tax()+bonus()+raiseSalary()));
    }




}
