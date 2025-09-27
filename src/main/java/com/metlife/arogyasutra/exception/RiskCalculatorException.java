package com.metlife.arogyasutra.exception;

public class RiskCalculatorException extends RuntimeException{
    public RiskCalculatorException(String message){
        super(message);
    }
    public RiskCalculatorException(String message,Throwable cause){
        super(message,cause);
    }
}
