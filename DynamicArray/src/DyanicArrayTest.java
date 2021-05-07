import ds.DynamicArray;

public class DyanicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        System.out.println(dynamicArray.size());
        dynamicArray.print();
        System.out.println(dynamicArray.contains(12));
        System.out.println(dynamicArray.empty());


        dynamicArray.add(22);
        System.out.println(dynamicArray.size());
        dynamicArray.print();
        System.out.println(dynamicArray.contains(12));
        System.out.println(dynamicArray.empty());
//        dynamicArray.remove(2);
    }

}
