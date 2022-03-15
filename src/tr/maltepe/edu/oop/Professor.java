package tr.maltepe.edu.oop;

public class Professor extends Person{
    private String prof_name;
    public String getProf_name() {
        return prof_name;
    }
    public void setProf_name(String prof_name) {
        this.prof_name=prof_name;
    }
    void teaches() {

        System.out.println("Professor " + getProf_name() + " is teaching now");

    }
}