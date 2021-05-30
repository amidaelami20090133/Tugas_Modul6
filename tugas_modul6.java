package stuck;
public class tugas_modul6 {
    public static void main(String[] args){
        tumpukan tumpuk= new tumpukan(10);
        tumpuk.baca();
        System.out.println(" ");
        tumpuk.push(50);
        tumpuk.baca();
        System.out.println(" ");
        tumpuk.push(100);
        tumpuk.baca();
        System.out.println(" ");
        tumpuk.pop();
        tumpuk.baca();
        
        System.out.println(" ");
        tumpuk.push(60);
        tumpuk.baca();
        System.out.println(" ");
        tumpuk.push(80);
        tumpuk.baca();
        
        tumpuk.pop();
        System.out.println(" ");
        tumpuk.baca();
        
        long nilai = tumpuk.peek();
        System.out.println("nilai top=" + nilai);
        }
}

