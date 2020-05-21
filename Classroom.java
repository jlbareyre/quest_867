public class Classroom {
    
    public static void main(String[] args) {
        
        Wilder w1 = new Wilder("Jean-Jacques", true);
        Wilder w2 = new Wilder("Jean-Paul", false);
        Wilder w3 = new Wilder("Dominique", true);
        Wilder w4 = new Wilder("Frédéric", false );
        Wilder w5 = new Wilder("Henri", true);

        System.out.println(w1.whoAmI());
        System.out.println(w2.whoAmI());
        System.out.println(w3.whoAmI());
        System.out.println(w4.whoAmI());
        System.out.println(w5.whoAmI());

    }
}