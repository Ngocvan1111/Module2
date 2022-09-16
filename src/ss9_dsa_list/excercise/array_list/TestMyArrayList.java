package ss9_dsa_list.excercise.array_list;

import ss5_access_modifier_and_static_method.excercise.develop_class_only_write_in_java.Student;
import ss9_dsa_list.practive.arraylist.MyList;

public class TestMyArrayList {
    private int id;
    private String name;

    public TestMyArrayList(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public TestMyArrayList() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        MyArraysList<Integer> listIntegers= new MyArraysList<>();
        listIntegers.add(1);
        listIntegers.add(2);
        listIntegers.add(3);
        listIntegers.add(4);
        listIntegers.add(5);
        listIntegers.add(4);
        listIntegers.add(5);
        System.out.println("Element in arrays: ");
        for(int i = 0; i< listIntegers.size();i++){
            System.out.println("element "+i+" : "+listIntegers.get(i));
        }
//        System.out.println("size before clear: ");
//        System.out.println(listIntegers.size());

//        System.out.println("remove element of arrays list /////");
//        listIntegers.clear();
//        System.out.println("size after clear: ");
//        System.out.println(listIntegers.size());
//        System.out.println("Test indexof: 2");
//        System.out.println(listIntegers.indexOf(2));
//        System.out.println(listIntegers.contains(2));
        MyArraysList<Integer> newlistIntegers;
        newlistIntegers = listIntegers.clone();
        newlistIntegers.remove(0);
        for(int i = 0;i<newlistIntegers.size();i++){
            System.out.println(newlistIntegers.get(i));
        }



    }
}
