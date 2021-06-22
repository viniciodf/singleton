package br.com.vinicio;

import br.com.vinicio.singleton.Singleton;

public class SingletonApp {

    public static void main(String[] args) {
        Singleton singletonFirst = Singleton.getInstance("first");
        Singleton singletonSecond = Singleton.getInstance("second");

        System.out.println(singletonFirst.value);
        System.out.println(singletonSecond.value);
    }


}
