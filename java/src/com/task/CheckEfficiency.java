package com.task;

import java.util.ArrayList;
import java.util.LinkedList;

public class CheckEfficiency {
    static void checkEfficiency() {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        int size = 1000;
        //Add
        long elapsedArrayListAdd = getElapsedArrayListAdd(arrayList, size);
        long elapsedLinkedListAdd = getElapsedLinkedListAdd(linkedList, size);

        //Get
        long elapsedArrayListGet = getElapsedArrayListGet(arrayList, size);
        long elapsedLinkedListGet = getElapsedLinkedListGet(linkedList, size);

        //Delete
        long elapsedArrayListDelete = getElapsedArrayListDelete(arrayList, size);
        long elapsedLinkedListDelete = getElapsedLinkedListDelete(linkedList, size);

        Table.createGUI(elapsedArrayListAdd, elapsedArrayListGet, elapsedArrayListDelete, elapsedLinkedListAdd, elapsedLinkedListGet, elapsedLinkedListDelete);
    }

    /**
     * @param linkedList - лист, производительность окторого проверяется
     * @param size       - то сколько раз будет вызываться метод
     * @return long - возвращает время проведения операции
     */
    private static long getElapsedLinkedListDelete(LinkedList linkedList, int size) {
        long startLinkedListDelete = System.nanoTime();//засекаем время начала Get в LinkedList
        for (int i = 0; i < size; i++) {
            linkedList.remove(0);
        }
        long finishLinkedListDelete = System.nanoTime();//засекаем время конца Get в LinkedList
        long elapsedLinkedListDelete = finishLinkedListDelete - startLinkedListDelete;
        return elapsedLinkedListDelete;
    }

    /**
     * @param arrayList - лист, производительность окторого проверяется
     * @param size      - то сколько раз будет вызываться метод
     * @return long - возвращает время проведения операции
     */
    private static long getElapsedArrayListDelete(ArrayList arrayList, int size) {
        long startArrayListDelete = System.nanoTime();//засекаем время начала Get в ArrayList
        for (int i = 0; i < size; i++) {
            arrayList.remove(0);
        }
        long finishArrayListDelete = System.nanoTime();//засекаем время конца Get в ArrayList
        long elapsedArrayListDelete = finishArrayListDelete - startArrayListDelete;
        return elapsedArrayListDelete;
    }

    /**
     * @param linkedList - лист, производительность окторого проверяется
     * @param size       - то сколько раз будет вызываться метод
     * @return long - возвращает время проведения операции
     */
    private static long getElapsedLinkedListGet(LinkedList linkedList, int size) {
        long startLinkedListGet = System.nanoTime();//засекаем время начала Get в LinkedList
        for (int i = 0; i < size; i++) {
            linkedList.get(0);
        }
        long finishLinkedListGet = System.nanoTime();//засекаем время конца Get в LinkedList
        long elapsedLinkedListGet = finishLinkedListGet - startLinkedListGet;
        return elapsedLinkedListGet;
    }

    /**
     * @param arrayList- лист, производительность окторого проверяется
     * @param size       - то сколько раз будет вызываться метод
     * @return long - возвращает время проведения операции
     */
    private static long getElapsedArrayListGet(ArrayList arrayList, int size) {
        long startArrayListGet = System.nanoTime();//засекаем время начала Get в ArrayList
        for (int i = 0; i < size; i++) {
            arrayList.get(0);
        }
        long finishArrayListGet = System.nanoTime();//засекаем время конца Get в ArrayList
        long elapsedArrayListGet = finishArrayListGet - startArrayListGet;
        return elapsedArrayListGet;
    }

    /**
     * @param linkedList- лист, производительность окторого проверяется
     * @param size        - то сколько раз будет вызываться метод
     * @return long - возвращает время проведения операции
     */
    private static long getElapsedLinkedListAdd(LinkedList linkedList, int size) {
        long startLinkedListAdd = System.nanoTime();//засекаем время начала Add в LinkedList
        for (int i = 0; i < size; i++) {
            linkedList.add(0);
        }
        long finishLinkedListAdd = System.nanoTime();//засекаем время конца Add в LinkedList
        long elapsedLinkedListAdd = finishLinkedListAdd - startLinkedListAdd;
        return elapsedLinkedListAdd;
    }

    /**
     * @param arrayList- лист, производительность окторого проверяется
     * @param size       - то сколько раз будет вызываться метод
     * @return long - возвращает время проведения операции
     */
    private static long getElapsedArrayListAdd(ArrayList arrayList, int size) {
        long startArrayListAdd = System.nanoTime();//засекаем время начала Add в ArrayList
        for (int i = 0; i < size; i++) {
            arrayList.add(0);
        }
        long finishArrayListAdd = System.nanoTime();//засекаем время конца Add в ArrayList
        long elapsedArrayListAdd = finishArrayListAdd - startArrayListAdd;
        return elapsedArrayListAdd;
    }
}
