package com.examples.beans;
import com.examples.beans.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeakers implements Speakers
{
    public String makeSound()
    {
        return "Playing music from Bose speakers";
    }
}