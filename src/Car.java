public class Car {
    private int id;
    private int nomerAvto;

    public Car(int id, int nomerAvto) {


        this.id = id;
        this.nomerAvto = nomerAvto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNomerAvto() {
        return nomerAvto;
    }

    public void setNomerAvto(int nomerAvto) {
        this.nomerAvto = nomerAvto;
    }

    @Override
    public String toString() {
        return "Car" +
                "id : " + id +
                " nomerAvto : " + nomerAvto;
    }
}
