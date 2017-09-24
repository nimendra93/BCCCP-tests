/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.tickets.adhoc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sithira
 */
public class AdhocTicketTest {
    
    public AdhocTicketTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBarcode method, of class AdhocTicket.
     */
    @Test
    public void testGetBarcode() {
        System.out.println("getBarcode");
        AdhocTicket instance = new AdhocTicket("CARP00001", 1, "Ticket0001");
        String expResult = "Ticket0001";
        String result = instance.getBarcode();
        assertEquals(expResult, result);;
    }

    /**
     * Test of getCarparkId method, of class AdhocTicket.
     */
    @Test
    public void testGetCarparkId() {
        System.out.println("getCarparkId");
        AdhocTicket instance = new AdhocTicket("CARP00001", 1, "Ticket0001");
        String expResult = "CARP00001";
        String result = instance.getCarparkId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTicketNo method, of class AdhocTicket.
     */
    @Test
    public void testGetTicketNo() {
        System.out.println("getTicketNo");
        AdhocTicket instance = new AdhocTicket("CARP00001", 1, "Ticket0001");
        int expResult = 0;
        int result = instance.getTicketNo();
        assertEquals(expResult, result);
    }

    /**
     * Test of enter method, of class AdhocTicket.
     */
    @Test
    public void testEnter() {
        System.out.println("enter");
        long entryDateTime = 0L;
        AdhocTicket instance = new AdhocTicket("CARP00001", 1, "Ticket0001");
        instance.enter(entryDateTime);
    }

    /**
     * Test of getEntryDateTime method, of class AdhocTicket.
     */
    @Test
    public void testGetEntryDateTime() {
        System.out.println("getEntryDateTime");
        AdhocTicket instance = new AdhocTicket("CARP00001", 1, "Ticket0001");
        long expResult = 0L;
        long result = instance.getEntryDateTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of pay method, of class AdhocTicket.
     */
    @Test
    public void testPay() {
        System.out.println("pay");
        long paidDateTime = 0L;
        float charge = 0.0F;
        AdhocTicket instance = new AdhocTicket("CARP00001", 1, "Ticket0001");
        instance.pay(paidDateTime, charge);
    }

    /**
     * Test of getPaidDateTime method, of class AdhocTicket.
     */
    @Test
    public void testGetPaidDateTime() {
        System.out.println("getPaidDateTime");
        AdhocTicket instance = new AdhocTicket("CARP00001", 1, "Ticket0001");
        long expResult = 0L;
        long result = instance.getPaidDateTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCharge method, of class AdhocTicket.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        AdhocTicket instance = new AdhocTicket("CARP00001", 1, "Ticket0001");
        float expResult = 0.0F;
        float result = instance.getCharge();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of toString method, of class AdhocTicket.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AdhocTicket instance = new AdhocTicket("CARP00001", 1, "Ticket0001");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCurrent method, of class AdhocTicket.
     */
    @Test
    public void testIsCurrent() {
        System.out.println("isCurrent");
        AdhocTicket instance = new AdhocTicket("CARP00001", 1, "Ticket0001");
        boolean expResult = false;
        boolean result = instance.isCurrent();
        assertEquals(expResult, result);
    }

    /**
     * Test of isPaid method, of class AdhocTicket.
     */
    @Test
    public void testIsPaid() {
        System.out.println("isPaid");
        AdhocTicket instance = new AdhocTicket("CARP00001", 1, "Ticket0001");
        boolean expResult = false;
        boolean result = instance.isPaid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExitDateTime method, of class AdhocTicket.
     */
    @Test
    public void testGetExitDateTime() {
        System.out.println("getExitDateTime");
        AdhocTicket instance = new AdhocTicket("CARP00001", 1, "Ticket0001");
        long expResult = 0L;
        long result = instance.getExitDateTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of hasExited method, of class AdhocTicket.
     */
    @Test
    public void testHasExited() {
        System.out.println("hasExited");
        AdhocTicket instance = null;
        boolean expResult = false;
        boolean result = instance.hasExited();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
