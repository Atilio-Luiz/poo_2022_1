public class CreateWrapperBoxing {
    public static void main(String[] args) {

        Double myDouble = 5.99; // criando um novo Double

        System.out.println(myDouble); // chama toString()
        
        Double ref = 5.99;

        if(ref == myDouble) 
            System.out.println("são o mesmo objeto");
        else 
            System.out.println("objetos distintos");

        if(ref.equals(myDouble)) 
            System.out.println("possuem mesmo valor");
        else 
            System.out.println("possuem valores distintos");
    }
}