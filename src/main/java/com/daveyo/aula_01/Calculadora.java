package com.daveyo.aula_01;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    int somar(int numero1, int numero2){
        return numero1+numero2;
    }

}
