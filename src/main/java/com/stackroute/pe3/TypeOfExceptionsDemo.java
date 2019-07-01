package com.stackroute.pe3;

public class TypeOfExceptionsDemo {
    public String causeException(Integer arraySize) {
        try{
            String[] arr = new String[arraySize];
            System.out.println(arr[arraySize+1]);
        }
        catch (NegativeArraySizeException n){
            return "Caught Negative Array Size Exception "+n.getMessage();
        }
        catch (IndexOutOfBoundsException i){
            return "Caught index out of bounds exception: "+i.getMessage();
        }
        catch (NullPointerException npe){
            return "Caught Null Pointer Exception: "+npe.getMessage();
        }
        return "";
    }
}
