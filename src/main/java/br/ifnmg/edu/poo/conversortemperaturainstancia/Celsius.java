package br.ifnmg.edu.poo.conversortemperaturainstancia;

/**
 * Classe que contém métodos específicos a partir da temperatura Celsius.
 * @author André (@andref03)
 */
public class Celsius {

    private float tempCelsius;
    private float tempFahrenheit;
    private float tempKelvin;

    public Celsius() {
    }

    public Celsius(float tempCelsius) throws Exception {
        setTempCelsius(tempCelsius);
    }

    public float getTempCelsius() {
        return tempCelsius;
    }

    public void setTempCelsius(float tempCelsius) throws Exception {
        if (tempCelsius < -273) {
            throw new Exception(">>> Exception em Celsius: a temperatura deve ser maior "
                    + "ou igual a -273 ºC.\n\t>> Valor registrado: " + tempCelsius + " ºC.");
        }
        this.tempCelsius = tempCelsius;
    }

    public float getTempFahrenheit() {
        return tempFahrenheit;
    }

    public float getTempKelvin() {
        return tempKelvin;
    }

    public float converterCelsiusParaKelvin() {
        this.tempKelvin = this.tempCelsius + 273f;
        return tempKelvin;
    }

    public float converterCelsiusParaFahrenheit() {
        this.tempFahrenheit = (9 * this.tempCelsius) / 5 + 32;
        return tempFahrenheit;
    }

    @Override
    public String toString() {
        return "Celsius{" + "temperatura = " + tempCelsius + " ºC " + '}';
    }
}
