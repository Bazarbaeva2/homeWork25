import java.util.*;

public class Main {
    public static void main(String[] args) {


//        Car деген класс тузунуз (Id, номер авто)
//        Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
//        HashMap тузунуз ключ - машина, маани - машинанын данныйлары
//        HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.

        HashMap<Car,GetInfo> carCarHashMap = new HashMap<>();
        carCarHashMap.put(new Car(1,145), new GetInfo(2010,"M5",120000,"Black"));
        carCarHashMap.put(new Car(2,348), new GetInfo(2021,"V8",180000,"Waite"));
        carCarHashMap.put(new Car(3,456),new GetInfo(2015,"B8",200000,"Red"));
        carCarHashMap.put(new Car(4,951),new GetInfo(2022,"X10",210000,"Blue"));

        for(Map.Entry<Car, GetInfo> carInfoEntry : carCarHashMap.entrySet()){
            System.out.println(carInfoEntry);
        }


    }
}