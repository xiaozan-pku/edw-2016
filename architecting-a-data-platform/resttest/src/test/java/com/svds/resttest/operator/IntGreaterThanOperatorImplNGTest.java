/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.svds.resttest.operator;

import java.util.Arrays;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author kevin
 */
public class IntGreaterThanOperatorImplNGTest {
    
    public IntGreaterThanOperatorImplNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of process method, of class IntGreaterThanOperatorImpl.
     */
    @Test
    public void testProcess() throws Exception {
        System.out.println("IntGreaterThanOperatorImpl.process");
        String columnName = "colName";
        List<String> values = Arrays.asList("42");
        IntGreaterThanOperatorImpl instance = new IntGreaterThanOperatorImpl();
        String expResult = "colName > 42 ";
        String result = instance.process(columnName, values);
        assertEquals(result, expResult);
    }
    
}
