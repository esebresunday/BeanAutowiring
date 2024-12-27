package com.examples.beans;
import com.examples.beans.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres
{
    public String rotate()
    {
        return "Rotating Bridge Stone";
    }
}