public class Main {
    public static void main(String[] args){


        Fighter alex=new Fighter("Alex",10,95,100,50,50);
        Fighter marc=new Fighter("Marc",15,100,95,0,50);

        Ring r=new Ring(alex,marc,90,100);
        r.run();




    }
}
