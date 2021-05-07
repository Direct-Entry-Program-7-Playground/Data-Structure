import ds.DynamicArray;

public class DyanicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        System.out.println(dynamicArray.size());
        dynamicArray.print();
        System.out.println(dynamicArray.contains(12));
        System.out.println(dynamicArray.empty());


        dynamicArray.add(11);
        dynamicArray.add(22);
        dynamicArray.add(33);
        dynamicArray.add(44);
        dynamicArray.add(55);
        dynamicArray.add(1, 66);
        System.out.println(dynamicArray.size());
        dynamicArray.print();
        System.out.println(dynamicArray.contains(22));
        dynamicArray.add(3,15);
        dynamicArray.remove(2);
        dynamicArray.print();
        System.out.println(dynamicArray.get(1));

        System.out.println(dynamicArray.empty());
        dynamicArray.clear();
        dynamicArray.add(0,15);
        dynamicArray.print();


    }

}
