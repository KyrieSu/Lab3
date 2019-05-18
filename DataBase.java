import java.util.Vector;

public class DataBase {
    private static Vector<Record> db = null; //mock db


    public static Vector<Record> getInstance(){
        if(db==null){
            db = new Vector<Record>();
        }
        return db;
    }



    public void printStatement(Customer c){
        int tmp = 0;
        System.out.println("--------------------------------");
        for (Record r:db){
            if(r.getCustomerName().equals(c.getName())){
                tmp+=r.getTotal();
                System.out.printf("%s 曾經租過 %s%n",r.getCustomerName(),r.getVideoName());
            }
        }
        System.out.printf("%s 累積消費金額為 %d元%n",c.getName(),tmp);
        System.out.printf("%s 累積紅利為 %.1f點%n",c.getName(),c.getBonus());
        System.out.println("--------------------------------");
    }
}
