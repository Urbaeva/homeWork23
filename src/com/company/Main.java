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
        Arrays.sort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));

        System.out.println("\nArrayList before sorting: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("ArrayList after sorting: " + arrayList);

        System.out.println("\nLinkedList before sorting: " + linkedList);
        Collections.sort(linkedList);
        System.out.println("LinkedList after sorting: " + linkedList);
    }
}
