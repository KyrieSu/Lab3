public class DVD {
    private String name;
    private int price;
    private double bonus;
    private int limit;
    private int extra;

    public DVD(){
        name = "";
        price = 0;
        bonus = 0;
        limit = 0;
        extra = 0;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public void setName(String s){
        this.name = s;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice(){
        return price;
    }

    public double getBonus() {
        return bonus;
    }

    public int Calculate(int day){
        if(day<=getLimit()){
            return getPrice();
        }else{
            return getPrice()+(day-getLimit())*getExtra();
        }
    }

}
