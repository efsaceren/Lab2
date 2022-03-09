

public class SimpleMain {

    public static void main(String[] args) {
        professor p1,p2;

        p1 = new professor("Ensar Gul");
        p1.teaches();

        p2 = new professor("Raif Onvural");
        p2.teaches();


        student s3,s4,s5;

        s3 = new student("Melisa");
        s3.learnes();

        s4 = new student("Ceren");
        s4.learnes();

        s5 = new student("Efsa");
        s5.learnes();
        }
    }
