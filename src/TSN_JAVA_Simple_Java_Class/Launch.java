package TSN_JAVA_Simple_Java_Class;

public class Launch {

    public static void main(String[] args) {
        // Создаем переменную-объект "vasa" типа класса "Human" через конструктор по-умолчанию
        Human vasa = new Human(); 

        vasa.setAge(12); // Укажем через сеттер что Васе 12 лет
        vasa.setFio("VASA"); // Укажем через сеттер что имя Васе "VASA"
        vasa.setIsMan(true); // Укажем через сеттер что Вася мужского пола
        
        System.out.println(vasa.getAge()); // Выведем на экран через геттер класса возраст Васи
        System.out.println(vasa.getFio()); // Выведем на экран через геттер класса имя Васи
        System.out.println(vasa.isIsMan()); // Выведем на экран через геттер класса пол Васи
        
        System.out.println(vasa); // Выведем на экран через метод "toString" класса все данные объекта-Васи
        
        // Создаем переменную-объект "pet" типа класса "Human" через конструктор по-умолчанию
        Human pet = new Human();
        System.out.println(pet);// Выведем на экран через метод "toString" класса все данные объекта "pet"
        
        // Создаем переменную-объект "anna" типа класса "Human" через конструктор c 3 парамтрами 
        Human anna = new Human(12, "Anna", false);
        System.out.println(anna);

        // Создаем переменную-объект "dasha" типа класса "Human" через конструктор c 2 параметрами
        Human dasha = new Human( "Dasha", false);        
        System.out.println(dasha);
    }
    
}
