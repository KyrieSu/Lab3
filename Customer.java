import java.util.Vector;

public class Customer {
    private String name;
    private double bonus;
    private Vector<Record> db;

    public Customer(String s){
        setName(s);
        bonus = 0.0;
        db = Adapter.getInstance();
    }

    public void BorrowDVD(DVD d,int days){
        db.add(new Record(this,d,days));
        setBonus(d.getBonus());
    }

    public String getName() {
        return name;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus += bonus;
    }

    public void setName(String name) {
        this.name = name;
    }
}
