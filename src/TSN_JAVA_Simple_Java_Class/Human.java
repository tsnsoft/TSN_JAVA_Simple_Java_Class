package TSN_JAVA_Simple_Java_Class;

public class Human {

    private int age;
    private String fio;
    private boolean isMan;

    public Human() {
        age = -1;
        fio = "???";
        isMan = true;
    }
    public Human(String fio, boolean isMan) {
        this.age = -1;
        this.fio = fio;
        this.isMan = isMan;
    }

    public Human(int age, String fio, boolean isMan) {
        this.age = age;
        this.fio = fio;
        this.isMan = isMan;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public boolean isIsMan() {
        return isMan;
    }

    public void setIsMan(boolean isMan) {
        this.isMan = isMan;
    }
    
    @Override
    public String toString() {
        return fio + " {" + "age=" + age + ", isMan=" + isMan + '}';
    }

   
}
