package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Size: ");
        int n = scanner.nextInt();
	    int[] array = new int[n];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int rand = random.nextInt(2);
            array[i] = rand;
            arrayList.add(rand);
            linkedList.add(rand);
        }
        System.out.println("Array before sorting: " + Arrays.toString(array));
        sort(array);
        System.out.println("\nArrayList before sorting: " + arrayList);
        sort(arrayList);
        System.out.println("\nLinkedList before sorting: " + linkedList);
        sort(linkedList);
    }

    public static void sort(int[] array){
        Arrays.sort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
    public static void sort(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        System.out.println("ArrayList after sorting: " + arrayList);
    }
    public static void sort(LinkedList<Integer> linkedList){
        Collections.sort(linkedList);
        System.out.println("LinkedList after sorting: " + linkedList);
    }
}
