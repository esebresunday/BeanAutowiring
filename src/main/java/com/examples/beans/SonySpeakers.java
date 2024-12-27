package com.examples.beans;
import com.examples.beans.Speakers;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers
{
    public String makeSound()
    {
        return "Playing music from Sony";
    }
}