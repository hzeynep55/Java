
public class Main {
    public static void main(String[] args){

        Course mat=new Course("Matematik","MAT","MAT101");
        Course turkce=new Course("Türkçe","TR","TR101");
        Course kimya=new Course("Kimya","KIM","KIM101");
        Course fizik=new Course("Fizik","FIZ","FIZ101");


        Teacher mat_t=new Teacher("Berra Nur Durhat","95000045","MAT");
        Teacher turk_t=new Teacher("Saliha Rana Durhat","92000063","TR");
        Teacher kim_t=new Teacher("Ahmet Durhat","96000035","KIM");
        Teacher fiz_t=new Teacher("Hanne Zeynep Durhat","93000058","FIZ");


        mat.addTeacher(mat_t);
        turkce.addTeacher(turk_t);
        kimya.addTeacher(kim_t);
        fizik.addTeacher(fiz_t);




        Student s1=new Student("Mehmet Akif","886",12,mat,turkce,kimya,fizik);
        s1.addBulExam(50,60,69,70,74,58,90,82);
        s1.isPass();

        Student s2=new Student("Hanne Zeynep","995",12,mat,turkce,kimya,fizik);
        s2.addBulExam(70,80,69,75,74,63,86,85);
        s2.isPass();
    }

}