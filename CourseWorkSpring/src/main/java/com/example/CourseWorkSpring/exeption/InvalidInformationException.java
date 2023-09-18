package com.example.CourseWorkSpring.exeption;

public class InvalidInformationException extends IllegalArgumentException{

    public InvalidInformationException(String s) {
        super(s);
    }
}
