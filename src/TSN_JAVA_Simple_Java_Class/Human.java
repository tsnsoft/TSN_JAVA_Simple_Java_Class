package TSN_JAVA_Simple_Java_Class;

// Класс с именем "Human" 
public class Human {

    private int age; // это внутреннее (инкапсулированное) целое поле (свойство) "age"
    private String fio; // это внутреннее (инкапсулированное) строковое поле (свойство) "fio"
    private boolean isMan; // это внутреннее (инкапсулированное) логическое поле (свойство) "isMan"

    // Это конструктор по-умолчанию (без параметров)
    public Human() {
        age = -1; // инициализируем свойство "age" нужным нам значением по-умолчанию
        fio = "???"; // инициализируем свойство "fio" нужным нам значением по-умолчанию
        isMan = true; // инициализируем свойство "isMan" нужным нам значением по-умолчанию
    }

    // Это конструктор c 2 параметрами. Сигнатура метода: СТРОКА, ЛОГИЧЕСКОЕ)
    public Human(String fio, boolean isMan) {
        this.age = -1;
        this.fio = fio;
        this.isMan = isMan;
    }

    // Это конструктор c 3 параметрами. Сигнатура метода: ЦЕЛОЕ, СТРОКА, ЛОГИЧЕСКОЕ)
    public Human(int age, String fio, boolean isMan) {
        this.age = age;
        this.fio = fio;
        this.isMan = isMan;
    }

    // Геттер (получатель значения) для поля "age"
    public int getAge() {
        return age;
    }

    // Сеттер (установщик значения) для поля "age"
    public void setAge(int age) {
        this.age = age;
    }

    // Геттер (получатель значения) для поля "fio"
    public String getFio() {
        return fio;
    }

    // Сеттер (установщик значения) для поля "fio"
    public void setFio(String fio) {
        this.fio = fio;
    }

    // Геттер (получатель значения) для поля "isMan"
    public boolean isIsMan() {
        return isMan;
    }

    // Сеттер (установщик значения) для поля "isMan"
    public void setIsMan(boolean isMan) {
        this.isMan = isMan;
    }
    
    @Override
    // Переопределение метода "toString" для печати объектов класса
    public String toString() {
        return fio + " {" + "age=" + age + ", isMan=" + isMan + '}';
    }

   
}
