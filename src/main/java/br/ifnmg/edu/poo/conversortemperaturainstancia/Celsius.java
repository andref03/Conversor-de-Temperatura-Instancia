package br.ifnmg.edu.poo.conversortemperaturainstancia;

/**
 *
 * @author André (@andref03)
 */
public class Celsius {

    private float tempCelsius;
    private float tempFahrenheit;
    private float tempKelvin;

    public Celsius() {
    }

    public Celsius(float tempCelsius) {
        this.tempCelsius = tempCelsius;
    }

    public float getTempCelsius() {
        return tempCelsius;
    }

    public void setTempCelsius(float tempCelsius) {
        this.tempCelsius = tempCelsius;
    }

    public float getTempFahrenheit() {
        return tempFahrenheit;
    }

    public float getTempKelvin() {
        return tempKelvin;
    }

    public float converterCelsiusParaKelvin() {
        this.tempKelvin = this.tempCelsius + 273.15f;
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
