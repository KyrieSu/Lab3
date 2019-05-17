import java.util.Vector;

public class Record {
    private String CustomerName;
    private String VideoName;
    private int day;
    private int total;


    public Record(Customer c,DVD dvd,int day){
        this.CustomerName = c.getName();
        this.VideoName = dvd.getName();
        this.day = day;
        this.total = dvd.Calculate(day);
    }

    public int getTotal() {
        return total;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getVideoName() {
        return VideoName;
    }

}
