package stuck;
public class tumpukanApp {
    public static void main(String[] args){
        tumpukan tumpuk= new tumpukan(10);
        tumpuk.baca();
        tumpuk.push(56);
        tumpuk.baca();
        tumpuk.push(67);
        tumpuk.baca();
        long nilai1 = tumpuk.pop();
        System.out.println("nilai1 ="+nilai1);
        System.out.println("");
        tumpuk.push(83);
        tumpuk.baca();
        tumpuk.push(27);
        tumpuk.baca();
        long nilai2 = tumpuk.pop();
        System.out.print("nilai2 =" +nilai2);
        System.out.println("");
        long nilai3 = tumpuk.pop();
        System.out.println("nilai3 ="+nilai3);
        System.out.println("");
        tumpuk.baca();
    }
}
