import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Adapter mock = new Adapter();

        Customer April = new Customer("April");
        Customer Joe = new Customer("Joe");

        // A -> 神力女超人
        DVD A = new OldDVD("神力女超人");

        // B -> 正義聯盟
        DVD B = new NewDVD("正義聯盟");

        // C -> 雷神索爾3
        DVD C = new NewDVD("雷神索爾3");

        April.BorrowDVD(A,3);
        Joe.BorrowDVD(A,2);
        April.BorrowDVD(B,5);
        Joe.BorrowDVD(C,1);

        mock.printStatement(April);
        mock.printStatement(Joe);

    }
}
