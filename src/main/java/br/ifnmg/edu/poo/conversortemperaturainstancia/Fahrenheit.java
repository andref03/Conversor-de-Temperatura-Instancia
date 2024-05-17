package br.ifnmg.edu.poo.conversortemperaturainstancia;

/**
 *
 * @author André (@andref03)
 */
public class Fahrenheit {

    private float tempFahrenheit;
    private float tempKelvin;
    private float tempCelsius;

    public Fahrenheit() {
    }

    public Fahrenheit(float tempFahrenheit) {
        this.tempFahrenheit = tempFahrenheit;
    }

    public float getTempFahrenheit() {
        return tempFahrenheit;
    }

    public void setTempFahrenheit(float tempFahrenheit) {
        this.tempFahrenheit = tempFahrenheit;
    }

    public float getTempKelvin() {
        return tempKelvin;
    }

    public float getTempCelsius() {
        return tempCelsius;
    }

    public float converterFahrenheitParaKelvin() {
        this.tempKelvin = (5 * (this.tempFahrenheit - 32)) / 9 + 273.15f;
        return tempKelvin;
    }

    public float converterFahrenheitParaCelsius() {
        this.tempCelsius = (5 * (tempFahrenheit - 32)) / 9;
        return tempCelsius;
    }

    @Override
    public String toString() {
        return "Fahrenheit{" + "temperatura = " + tempFahrenheit + " ºF " + '}';
    }

}
