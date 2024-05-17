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

    public Kelvin(float tempKelvin) throws Exception {
        setTempKelvin(tempKelvin);
    }

    public float getTempKelvin() {
        return tempKelvin;
    }

    public void setTempKelvin(float tempKelvin) throws Exception {
        if (tempKelvin < 0) {
            throw new Exception(">>> Exception em Kelvin: temperatura deve ser maior "
                    + "ou igual ao zero absoluto (0 K).\n\t>> Valor registrado: " + tempKelvin + " K.");
        }
        this.tempKelvin = tempKelvin;
    }

    public float getTempFahrenheit() {
        return tempFahrenheit;
    }

    public float getTempCelsius() {
        return tempCelsius;
    }

    public float converterKelvinParaCelsius() throws Exception {
        this.tempCelsius = this.tempKelvin - 273f;
        return tempCelsius;
    }

    public float converterKelvinParaFahrenheit() {
        this.tempFahrenheit = (9 * (this.tempKelvin - 273f)) / 5 + 32;
        return tempFahrenheit;
    }

    @Override
    public String toString() {
        return "Kelvin{" + "temperatura = " + tempKelvin + " K " + '}';
    }

}
