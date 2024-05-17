package br.ifnmg.edu.poo.conversortemperaturainstancia;

/**
 *
 * @author André (@andref03)
 */
public class ConversorTemperaturaInstancia {

    public static void main(String[] args) {

        try {
            Kelvin k1 = new Kelvin(176.35f);
//            Celsius c1 = new Celsius(-277.85f);  // gera um Exception
            Celsius c1 = new Celsius(24.85f);
            Fahrenheit f1 = new Fahrenheit(451f);

            System.out.println(f1);
            System.out.println(">> De Fahrenheit para Kelvin: " 
                    + f1.converterFahrenheitParaKelvin() + " K.");
            System.out.println(">> De Fahrenheit para Celsius: " 
                    + f1.converterFahrenheitParaCelsius() + " ºC.");
            System.out.println();

            System.out.println(c1);
            System.out.println(">> De Celsius para Kelvin: " 
                    + c1.converterCelsiusParaKelvin() + " K.");
            System.out.println(">> De Celsius para Fahrenheit: "
                    + c1.converterCelsiusParaFahrenheit() + " ºF.");
            System.out.println();

            System.out.println(k1);
            System.out.println(">> De Kelvin para Celsius: " 
                    + k1.converterKelvinParaCelsius() + " ºC.");
            System.out.println(">> De Kelvin para Fahrenheit: " 
                    + k1.converterKelvinParaFahrenheit() + " ºF.");
            System.out.println();
            
        } catch (Exception e) {
            System.out.println();
            System.out.println(e.getMessage());
        }
    }
}
