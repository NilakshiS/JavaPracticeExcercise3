package com.stackroute.pe3;

public class ExceptionDemo {
    public String exceptionThrow() {
        String result = "";
        try {
            int x = 0;
            int y = 5/x;
            //throw new Exception("Exception thrown");
        }
        catch (Exception e){
            result += "Caught the exception with message: "+e.getMessage();
        }
        finally {
            result += "\nIn finally!";
        }
        return result;
    }
}
