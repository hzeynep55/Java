public class Course {

    Teacher courseTeacher;
    String name;
    String prefix;
    String code;
    double note,note1,note2;



    public Course(String name,String prefix,String code){
        this.code=code;
        this.name=name;
        this.prefix=prefix;





    }

   public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher=t;
            printTeacher();
            System.out.println("İşlem Başarılı");

       }
        else{
            System.out.println(t.name+" bu dersi veremez.");

        }


   }
   public void printTeacher(){
        if(courseTeacher!=null){
            System.out.println(this.name+" dersinin akademisyeni: "+courseTeacher.name);
        }
        else{
            System.out.println(this.name+" dersine atanmamıştır.");
        }
   }


}
