class Color {
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();

     private Color () {
     }

     @Override
     public String toString() {
         for(var e : getClass().getFields()) {
             if(e == this) {
                 return "abba";//this.getClass().getName();
             }
         }
         return "";
     }
}

public class Teste3 {
    public static void main(String[] args) {
        Color c = Color.RED;
        Color d = Color.RED;
        if(c == d) 
            System.out.println("c e d são o mesmo objeto");
        if(c.equals(d)) 
            System.out.println("c e d são iguais");
        System.out.println(c.toString());
        System.out.println(d.toString());
    }
}