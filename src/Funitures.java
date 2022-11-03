public class Funitures {
    void buy(){
        System.out.println("Buy Funitures");
    }
}
class Sofa extends Funitures{
    void buy(){
        System.out.println("Anura buy a sofa");
    }
}
class Table extends Funitures{
    void buy(){
        System.out.println("Kamal buy a table");
    }
}
class Cupboard extends Funitures{
    void buy(){
        System.out.println("Samira buy a Cupboard");
    }
}
class Test{
    public static void main(String[] args) {
        Funitures fu ;
        fu = new Sofa();
        fu.buy();
        fu =new Table();
        fu.buy();
        fu=new Cupboard();
        fu.buy();

    }
}
