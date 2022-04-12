package pl.bonus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collections {



    List<String>initArray(){
        List<String> list = new ArrayList<>();
        list.add("green");
        list.add("red");
        list.add("yellow");
        list.add("white");
        list.add("brown");
        return list;
    }

    public void task1Print()
    {
        System.out.println(initArray());
    }

    public void iterateThroughtAllElements(){ //Write a Java program to iterate through all elements in a array list.

        for (String item : initArray()) {
            System.out.println(item);
        }
    }

    public void insertAnElement(){ //Write a Java program to insert an element into the array list at the first position
        List<String> list = initArray();
        String element = "Adam";
        list.add(0, element);
        System.out.println(list);
    }

    public String retrive(){ //Write a Java program to retrieve an element (at a specified index) from a given array list
        List<String> list = initArray();
        String get = list.get(0);
        return get;
    }

    public String update(){ //Write a Java program to update specific array element by given element
        List<String> list = initArray();
        list.set(3, "Rondel");
        return list.get(3);
    }

    public List<String> remove(){ ////Write a Java program to remove the third element from a array list
        List<String> list = initArray();
        list.remove(3);
        return list;
    }

    public void search(){ //Write a Java program to search an element in a array list.
     List<String> list = initArray();
        System.out.println("What are u looking for?");
        String choice = scan.next();

        for(int i = 0; i < list.size(); i++)
        {
            if(choice.equals(list.get(i)))
            {
                System.out.println("Found it!");
                break;
            }
        }
    }

    public List<String> sortedList(){
        List<String> lista = initArray();
        java.util.Collections.sort(lista);
        return  lista;
    }

    public List<String> copyListToAnotherList(){
        List<String> lista = initArray();
        List<String> lista2 = new ArrayList<>();
        lista2.addAll(lista);
        return lista2;
     }

     public void shuffleAnElement(){ //get an element
         List<String> lista = initArray();
         System.out.println(lista.get(1));
     }

     public List<String> reverseList(){
        List<String> lista = initArray();
         java.util.Collections.reverse(lista);
         return lista;
    }

    public List<String> extractData(){
        List<String> lista = initArray().subList(0,2);
        return lista;
    }

    public void compareLists(){
        List<String> lista = initArray();
        List<String> lista2 = initArray();
        java.util.Collections.sort(lista);
        java.util.Collections.sort(lista2);

        boolean isEqual = lista.equals(lista2);
        System.out.println(isEqual);
    }

    public void joinTwoLists(){
        List<String> lista = initArray();
        List<String> lista2 = initArray();
        lista.addAll(lista2);
        System.out.println(lista);
    }
    





static Scanner scan = new Scanner(System.in);





}
