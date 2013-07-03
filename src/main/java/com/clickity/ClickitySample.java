package com.clickity;

import java.io.IOException;

import com.clickity.model.Email;

import com.google.api.client.util.DateTime;

/**
 * Hello world!
 *
 */
public class ClickitySample 
{
    public static void main( String[] args ) throws IOException
    {	
    	String apiKey = "74bfc85b03c8425";
    	String mailbox = "b5c1d4be";
    	
        Clickity clickity = new Clickity(apiKey);
        Email[] emails = clickity.GetEmails(mailbox, null);
        Email email = emails[0];
        
        DateTime creationDate = email.creationdate;
        System.out.print(creationDate);
    }
}