package com.example;

public class CensusDataCustomeException extends Exception{
    public enum ExceptionData{
        Data_Incorrect;
    }
    public ExceptionData type;
    public CensusDataCustomeException(String message) {
        super(message);
        this.type = type;
    }
}
