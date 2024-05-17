package br.ifnmg.edu.poo.conversortemperaturainstancia;

/**
 *
 * @author André (@andref03)
 */
public class Kelvin {

    private float tempKelvin;
    private float tempFahrenheit;
    private float tempCelsius;

    public Kelvin() {
    }

    public Kelvin(float tempKelvin) {
        this.tempKelvin = tempKelvin;
    }

    public float getTempKelvin() {
        return tempKelvin;
    }

    public void setTempKelvin(float tempKelvin) {
        this.tempKelvin = tempKelvin;
    }

    public float getTempFahrenheit() {
        return tempFahrenheit;
    }

    public float getTempCelsius() {
        return tempCelsius;
    }

    public float converterKelvinParaCelsius() {
        this.tempCelsius = this.tempKelvin - 273.15f;
        return tempCelsius;
    }

    public float converterKelvinParaFahrenheit() {
        this.tempFahrenheit = (9 * (this.tempKelvin - 273.15f)) / 5 + 32;
        return tempFahrenheit;
    }

    @Override
    public String toString() {
        return "Kelvin{" + "temperatura = " + tempKelvin + " K " + '}';
    }

}
