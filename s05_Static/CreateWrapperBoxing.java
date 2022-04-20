public class CreateWrapperBoxing {
    public static void main(String[] args) {
        Integer myInt = 5; // criando um novo Integer
        Double myDouble = 5.99; // criando um novo Double
        Character myChar = 'A'; // criando um novo Character

        System.out.println(myInt); // chama toString()
        System.out.println(myDouble); // chama toString()
        System.out.println(myChar); // chama toString()

        Integer intRef = myInt; // intRef = 5

        if(intRef.equals(myInt)) 
            System.out.println("possuem o mesmo valor");
        else 
            System.out.println("possuem valores distintos");
    }
}