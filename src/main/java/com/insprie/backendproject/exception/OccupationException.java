package com.insprie.backendproject.exception;

public class OccupationException extends Exception{

    public OccupationException(String code){
        super (code);
    }

    public static OccupationException occupationIsNull() {
        return new OccupationException("occupation.dataIsNull");
    }
}
