package com.example.ProjectConfig;

import com.examples.beans.Person1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "com.examples.beans")
public class ProjectConfig
{
}
