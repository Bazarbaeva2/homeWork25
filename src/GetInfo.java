public class GetInfo {
    private int yearOfIssue;
    private String madel;
    private int price;
    private String color;

    public GetInfo(int yearOfIssue, String madel, int price, String color) {
        this.yearOfIssue = yearOfIssue;
        this.madel = madel;
        this.price = price;
        this.color = color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getMadel() {
        return madel;
    }

    public void setMadel(String madel) {
        this.madel = madel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "GetInfo:" +
                "yearOfIssue: " + yearOfIssue +
                "madel: " + madel +
                "price: " + price +
                "color "+ color;
    }
}
