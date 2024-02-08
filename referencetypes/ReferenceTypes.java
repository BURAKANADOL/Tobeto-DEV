package referencetypes;

public class ReferenceTypes {
    public static void main(String[] args) {

        int[] numbers1 = {1,2,3};
        int[] numbers2 = {10,20,30};

        for(int i : numbers1){
            System.out.println(i);
        }
        System.out.println("*********");
        for(int i : numbers2){
            System.out.println(i);
        }
        System.out.println("*********");

        numbers1 = numbers2;

        for(int i : numbers1){
            System.out.println(i);
        }
        System.out.println("*********");
        for(int i : numbers2){
            System.out.println(i);
        }
        System.out.println("*********");

        numbers2[0] = 1000;
        System.out.println(numbers2[0]);
        System.out.println(numbers1[0]);


    }





}
