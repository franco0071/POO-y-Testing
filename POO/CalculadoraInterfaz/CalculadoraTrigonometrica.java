package CalculadoraInterfaz;

import java.lang.Math;

// Implementación de CalculadoraTrigonometrica
public class CalculadoraTrigonometrica implements CalculadoraServicio {
    @Override
    public Integer suma(Integer num1, Integer num2) {
        return num1 + num2;
    }
    
    @Override
    public Integer resta(Integer num1, Integer num2) {
        return num1 - num2;
    }
    
    @Override
    public Integer multiplicacion(Integer num1, Integer num2) {
        return num1 * num2;
    }
    
    @Override
    public Double division(Integer dividendo, Integer divisor) {
        if (divisor != 0) {
            return (double) dividendo / divisor;
        } else {
            throw new ArithmeticException("División por cero no permitida");
        }
    }
    
    public Double seno(Double angulo) {
        return Math.sin(angulo);
    }
    
    public Double coseno(Double angulo) {
        return Math.cos(angulo);
    }
    
    public Double tangente(Double angulo) {
        return Math.tan(angulo);
    } 
}
