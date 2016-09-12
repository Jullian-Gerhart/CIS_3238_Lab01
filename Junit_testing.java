/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_testing;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author tue97305
 */
public class Junit_testing {
    @Test
    public void testNeagtiveYear(){
           Date d1 = new Date(-1,2,2);
           Date d2 = new Date(2016,2,2);
           assertEquals(-1,d1.daysTo(d2));
    }
    
    @Test
    public void testNeagtiveMonth(){
           Date d1 = new Date(2015,-1,2);
           Date d2 = new Date(2016,2,2);
           assertEquals(-1,d1.daysTo(d2));
    }
    
    @Test
    public void testBigMonth(){
           Date d1 = new Date(2015,13,2);
           Date d2 = new Date(2016,2,2);
           assertEquals(-1,d1.daysTo(d2));
    }
    
    @Test
    public void testNeagtiveDay(){
           Date d1 = new Date(2015,2,-1);
           Date d2 = new Date(2016,2,2);
           assertEquals(-1,d1.daysTo(d2));
    }
    
    @Test
    public void testBigDay(){
           Date d1 = new Date(2015,2,31);
           Date d2 = new Date(2016,2,2);
           assertEquals(-1,d1.daysTo(d2));
    }
    
    @Test
    public void testFunction(){
           Date d1 = new Date(2015,2,2);
           Date d2 = new Date(2016,2,2);
           assertEquals(365,d1.daysTo(d2));
    }
    
    @Test
    public void testPriorDate(){
           Date d1 = new Date(2016,2,2);
           Date d2 = new Date(2015,2,2);
           assertEquals(365,d1.daysTo(d2));
    }
    
    
    
}
