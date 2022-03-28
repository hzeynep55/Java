public class Student {
    String name,stuNo;
    int classes;
    double avarage;
    boolean isPass;
    Course mat;
    Course turkce;
    Course kimya;
    Course fizik;


    Student(String name,String stuNo,int classes,Course mat,Course turkce,Course kimya,Course fizik){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.mat=mat;
        this.turkce=turkce;
        this.kimya=kimya;
        this.fizik=fizik;
        this.isPass=false;
        calcavarage();

    }
    public void addBulExam(int matyazili,int matsozlu,int turkyazili,int turksozlu,int kimyayazili,int kimyasozlu,int fyazili,int fsozlu){
        if(matyazili>=0 && matyazili<=100)
            this.mat.note=matyazili;
        if(matsozlu>=0 && matsozlu<=100);
            this.mat.note2=matsozlu;
        if(turkyazili>=0 && turksozlu<=100);
             this.turkce.note=turkyazili;
        if(turksozlu>=0 && turksozlu<=100);
             this.turkce.note2=turksozlu;
        if(kimyayazili>=0 && kimyayazili<=100);
             this.kimya.note=kimyayazili;
        if(kimyasozlu>=0 && kimyasozlu<=100);
              this.kimya.note2=kimyasozlu;
        if(fyazili>=0 && fyazili<=100);
              this.fizik.note=fyazili;
        if(fsozlu>=0 && fsozlu<=100);
             this.fizik.note2=fsozlu;

    }
    public void isPass(){
        if(this.turkce.note==0 || this.mat.note==0|| this.kimya.note==0|| this.fizik.note==0 || this.turkce.note2==0 ||this.mat.note2==0||this.kimya.note2==0||this.fizik.note2==0)
            System.out.println("Notlar tam olarak girilmemiş");
        else
            isPass=isCheckPass();
            printNote();
            System.out.println("Ortalama: "+this.avarage);
            if(this.isPass)
                System.out.println("Sınıfı geçti");
            else
                System.out.println("Sınıfta kaldı.");
    }
    public void calcavarage(){
        this.turkce.note1=((this.turkce.note*0.8)+(this.turkce.note2*0.2));
        this.mat.note1=((this.mat.note*0.8)+(this.mat.note2*0.2));
        this.kimya.note1=((this.kimya.note*0.8)+(this.kimya.note2*0.2));
        this.fizik.note1=((this.fizik.note*0.8)+(this.fizik.note2*0.2));
        this.avarage=(this.turkce.note1*this.mat.note1+this.kimya.note1+this.fizik.note1)/4;




    }

    public boolean isCheckPass(){
        calcavarage();
        return this.avarage>55;

    }
    public void printNote(){
        System.out.println("Öğrenci: "+this.name);
        System.out.println("Türkçe Notu: "+this.turkce.note1);
        System.out.println("Matematik Notu: "+this.mat.note1);
        System.out.println("Kimya Notu: "+this.kimya.note1);
        System.out.println("Fizik Notu: "+this.fizik.note1);

    }






}

