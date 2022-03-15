package tr.maltepe.edu.oop;

public class SimpleMain {
    public static void main(String[] args) {


        Professor p1,p2;

        p1 = new Professor();
        p1.setProf_name("Ensar Gul");
        p1.teaches();
        p1.setId(190704034);
        System.out.println(p1.getId())  ;

        p2 = new Professor();
        p2.setProf_name("Raif Onvural");
        p2.teaches();


        Student s3,s4,s5;

        s3 = new Student();
        s3.setStd_name("Efsa");
        s3.learnes();

        s4 = new Student();
        s4.setStd_name("Melisa");
        s4.learnes();

        s5 = new Student();
        s5.setStd_name("Ayse");
        s5.learnes();


        }
    }
