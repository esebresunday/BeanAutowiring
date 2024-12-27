package com.examples.beans;
import com.examples.beans.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres
{
    public String rotate()
    {
        return "Rotating Michelin tyres";
    }
}
