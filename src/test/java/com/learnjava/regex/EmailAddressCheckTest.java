package com.learnjava.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by z001qgd on 3/13/17.
 */
public class EmailAddressCheckTest {
    private EmailAddressCheck emailValidator;

    @Before
    public void initData() {
        emailValidator = new EmailAddressCheck();
    }



    @Test
    public void ValidEmailTest() {

        assertTrue(emailValidator.validate("dilip.sundarraj@target.com"));
        }

    @Test
    public void InvalidEmailTest() {

        assertFalse(emailValidator.validate("dilip.sundarraj@@target.com"));
        assertFalse(emailValidator.validate("dilip"));
        assertFalse(emailValidator.validate("dilip.sundarraj"));
        assertFalse(emailValidator.validate("dilip.com"));
        assertFalse(emailValidator.validate("@dilip.com"));
    }

    @Test
    public void ValidEmailTest_MultipleEmails() {

        assertTrue(emailValidator.validate("dilip.sundarraj@target.com"));
    }




}
