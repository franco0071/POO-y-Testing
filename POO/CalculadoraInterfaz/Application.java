package CalculadoraInterfaz;


public class Application {
        public static void main(String[] args) {
            CalculadoraServicio calculadora = new CalculadoraSimple();
            
            // Operaciones básicas
            System.out.println("Suma: " + calculadora.suma(5, 3));
            System.out.println("Resta: " + calculadora.resta(5, 3));
            System.out.println("Multiplicación: " + calculadora.multiplicacion(5, 3));
            System.out.println("División: " + calculadora.division(5, 3));
            
            // Utilizando la calculadora trigonométrica
            CalculadoraTrigonometrica calculadoraTrig = new CalculadoraTrigonometrica();
            
            System.out.println("Seno: " + calculadoraTrig.seno(Math.PI / 2));
            System.out.println("Coseno: " + calculadoraTrig.coseno(Math.PI));
            System.out.println("Tangente: " + calculadoraTrig.tangente(0.0));
        }    
}
