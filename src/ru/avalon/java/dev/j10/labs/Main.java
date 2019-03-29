package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20]; //Инициализация массива на 20 ячеек
        
        for (int i = 0; i < array.length; i++){ //Заполнение массива
            array[i] = (int) Math.random()* 50;
        }
        
        //Инициализация и заполнение массива числами Фибоначчи
        Initializer fNumbsInit = new FibonacciInitializer();
        int[] fNumbs = new int[20];
        fNumbsInit.initialize(fNumbs);
        
        //Вычисление суммы чисел fNumbs
        int fNumbsSum = 0;
        for (int i = 0; i < fNumbs.length; i++){
            fNumbsSum += fNumbs[i];
        }
        
        //Инициализация массива для пузырьковой сортировки
        Initializer bsNumbsInit = new RandomInitializer(-50, 50);
        Sort bubbleSort = new BubbleSort();
        int[] bsNumbs = new int[20];
        bsNumbsInit.initialize(bsNumbs); //Заполнение массива
        bubbleSort.sort(bsNumbs); //Сортировка массива
        
        //Инициализация массива для сортировки выбором
        Initializer ssNumbsInit = new RandomInitializer(-50, 50);
        Sort selectionSort = new SelectionSort();
        int[] ssNumbs = new int[20];
        ssNumbsInit.initialize(ssNumbs); //Заполнение массива
        selectionSort.sort(ssNumbs); //Сортировка массива
	
        //Инициализация массива для сортировки Шелла
        Initializer shsNumbsInit = new RandomInitializer(-50, 50);
        Sort shellSort = new ShellSort();
        int[] shsNumbs = new int[20];
        shsNumbsInit.initialize(shsNumbs); //Заполнение массива
        shellSort.sort(shsNumbs); //Сортировка массива
    }
}
