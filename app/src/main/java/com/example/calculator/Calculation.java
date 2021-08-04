package com.example.calculator;

public class Calculation {
    protected float convertCelciusToFahrenheit(Float value) {
        return (value * 9/5) + 32;
    }

    protected float convertFahrenheitToCelcius(Float value) {
        return (value - 32) * 5/9;
    }

}
