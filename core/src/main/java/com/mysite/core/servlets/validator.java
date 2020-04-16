package com.mysite.core.servlets;


import io.wcm.devops.conga.plugins.aem.validator.AnyValidator;

import io.wcm.devops.conga.generator.spi.context.ValidatorContext;
import io.wcm.devops.conga.generator.spi.context.FileContext;
import io.wcm.devops.conga.generator.spi.ValidationException;
import java.io.*;

public class validator
{
    public static void main(String args[])
    {
        ValidatorContext context=new ValidatorContext();
        AnyValidator validator=new AnyValidator();

        FileContext file=new FileContext().file(new File("dispatcher.ANY"));
System.out.println(System.getProperty("user.dir"));
        try{
        validator.apply(file,context);
        }
        catch(ValidationException e)
        {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}