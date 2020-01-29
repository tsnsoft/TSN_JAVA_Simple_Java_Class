package TSN_JAVA_Simple_Java_Class;

public class Launch {

    public static void main(String[] args) {
        Human vasa = new Human();

        vasa.setAge(12);
        vasa.setFio("VSA");
        vasa.setIsMan(true);
        
        System.out.println(vasa.getAge());
        System.out.println(vasa.getFio());
        System.out.println(vasa.isIsMan());
        
        System.out.println(vasa);
        
        Human pet = new Human();
        System.out.println(pet);
        
        Human anna = new Human(12, "AAA", false);
        System.out.println(anna);

        Human dasha = new Human( "DDD", false);        
        System.out.println(dasha);
    }
    
}
