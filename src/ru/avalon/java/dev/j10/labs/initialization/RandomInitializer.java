package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {
    int min, max; //диапазон массива    
    
    public RandomInitializer(int min, int max){
        this.min = min;
        this.max = max;
    }

@Override
    public void initialize(int[] array) {
        
        for(int x = 0; x < array.length; x++){
            array[x] = (int) (Math.random()*(max - min) +1) + min;//генерация чисел [-50;50]
            }
    }
}
