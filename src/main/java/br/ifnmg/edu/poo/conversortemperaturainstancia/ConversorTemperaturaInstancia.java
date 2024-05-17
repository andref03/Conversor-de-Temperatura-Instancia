package br.ifnmg.edu.poo.conversortemperaturainstancia;

/**
 *
 * @author André (@andref03)
 */
public class ConversorTemperaturaInstancia {

    public static void main(String[] args) {
        
        Kelvin k1 = new Kelvin(176.35f);
        Celsius c1 = new Celsius(37f);
        Fahrenheit f1 = new Fahrenheit(-1.91f);
        
        System.out.println(f1);
        System.out.println(f1.converterFahrenheitParaKelvin());
        System.out.println(f1.converterFahrenheitParaCelsius());
        System.out.println();
        
        System.out.println(c1);
        System.out.println(c1.converterCelsiusParaKelvin());
        System.out.println(c1.converterCelsiusParaFahrenheit());
        System.out.println();

        System.out.println(k1);
        System.out.println(k1.converterKelvinParaCelsius());
        System.out.println(k1.converterKelvinParaFahrenheit());
        System.out.println();
        
    }
}
