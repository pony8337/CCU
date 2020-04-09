import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

    @Test
    void testData()  {
    	//Decision Table 1   
    	int y, m, d;
    	try {
    	  y = -32768;
    	  m = -32768;
    	  d = -32768;
    	  Date date1 = new Date(y, m, d);
    	  assertTrue(false);
    	}catch(IllegalDateException e){
    	  assertTrue(true);
    	}
    	
    	try {
      	  y = -32768;
      	  m = -32768;
      	  d = 1;
      	  Date date2 = new Date(y, m, d);
          assertTrue(false);
      	}catch(IllegalDateException e){
      	  assertTrue(true);
      	}
    	
    	try {
      	  y = -32768;
      	  m = 13;
      	  d = -32768;
      	  Date date3 = new Date(y, m, d);
      	  assertTrue(false);
      	}catch(IllegalDateException e){
      	  assertTrue(true);
      	}
    	
    	try {
      	  y = -32768;
      	  m = 13;
      	  d = 1;
      	  Date date4 = new Date(y, m, d);
      	  assertTrue(false);
      	}catch(IllegalDateException e){
      	  assertTrue(true);
      	}
    	
    	try {
      	  y = -32768;
      	  m = 1;
      	  d = -32768;
      	  Date date5 = new Date(y, m, d);
      	  assertTrue(false);
      	}catch(IllegalDateException e){
      	  assertTrue(true);
      	}
    	
    	try {
      	  y = -32768;
      	  m = 1;
      	  d = 1;
      	  Date date6 = new Date(y, m, d);
      	  assertTrue(false);
      	}catch(IllegalDateException e){
      	  assertTrue(true);
      	}
    	
    	try {
      	  y = 1;
      	  m = -32768;
      	  d = -32768;
      	  Date date7 = new Date(y, m, d);
      	  assertTrue(false);
      	}catch(IllegalDateException e){
      	  assertTrue(true);
      	}
    	
    	try {
      	  y = 1;
      	  m = -32768;
      	  d = 1;
      	  Date date8 = new Date(y, m, d);
      	  assertTrue(false);
      	}catch(IllegalDateException e){
      	  assertTrue(true);
      	}
 	
    	try {
      	  y = 1;
      	  m = 13;
      	  d = -32768;
      	  Date date9 = new Date(y, m, d);
      	  assertTrue(false);
      	}catch(IllegalDateException e){
      	  assertTrue(true);
      	}

    	try {
      	  y = 1;
      	  m = 13;
      	  d = 1;
      	  Date date10 = new Date(y, m, d);
      	  assertTrue(false);
      	}catch(IllegalDateException e){
      	  assertTrue(true);
      	}
    	
    	try {
      	  y = 1;
      	  m = 1;
      	  d = -32768;
      	  Date date11 = new Date(y, m, d);
          assertTrue(false);
      	}catch(IllegalDateException e){
      	  assertTrue(true);
      	}
    	//Decision Table 2
    	try {
        	  y = 400;
        	  m = 2;
        	  d = 1;
        	  Date date12 = new Date(y, m, d);
        	  assertTrue(true);
        	}catch(IllegalDateException e){
        	  assertTrue(false);
        	}
      	
      	try {
            y = 400;
            m = 2;
            d = 29;
            Date date13 = new Date(y, m, d);
            assertTrue(true);
          }catch(IllegalDateException e){
            assertTrue(false);
          }
      	try {
            y = 400;
            m = 2;
            d = 30;
            Date date14 = new Date(y, m, d);
            assertTrue(false);
          }catch(IllegalDateException e){
            assertTrue(true);
          }
    	try {
        	  y = 4;
        	  m = 2;
        	  d = 1;
        	  Date date15 = new Date(y, m, d);
        	  assertTrue(true);
        	}catch(IllegalDateException e){
        	  assertTrue(false);
        	}
      	
      	try {
            y = 4;
            m = 2;
            d = 29;
            Date date16 = new Date(y, m, d);
            assertTrue(true);
          }catch(IllegalDateException e){
            assertTrue(false);
          }
      	try {
            y = 4;
            m = 2;
            d = 30;
            Date date17 = new Date(y, m, d);
            assertTrue(false);
          }catch(IllegalDateException e){
            assertTrue(true);
          }
    	try {
        	  y = 1;
        	  m = 2;
        	  d = 1;
        	  Date date18 = new Date(y, m, d);
        	  assertTrue(true);
        	}catch(IllegalDateException e){
        	  assertTrue(false);
        	}
      	
      	try {
            y = 1;
            m = 2;
            d = 29;
            Date date19 = new Date(y, m, d);
            assertTrue(false);
          }catch(IllegalDateException e){
            assertTrue(true);
          }
      	try {
            y = 1;
            m = 2;
            d = 30;
            Date date20 = new Date(y, m, d);
            assertTrue(false);
          }catch(IllegalDateException e){
            assertTrue(true);
          }
      	
    	//Decision Table 3   
    	try {
      	  y = 1;
      	  m = 4;
      	  d = 1;
      	  Date date21 = new Date(y, m, d);
      	  assertTrue(true);
      	}catch(IllegalDateException e){
      	  assertTrue(false);
      	}
    	
    	try {
          y = 1;
          m = 4;
          d = 30;
          Date date22 = new Date(y, m, d);
          assertTrue(true);
        }catch(IllegalDateException e){
          assertTrue(false);
        }
    	try {
          y = 1;
          m = 4;
          d = 31;
          Date date23 = new Date(y, m, d);
          assertTrue(false);
        }catch(IllegalDateException e){
          assertTrue(true);
        }
    	
    	try {
          y = 1;
    	  m = 6;
    	  d = 1;
    	  Date date24 = new Date(y, m, d);
    	  assertTrue(true);
    	}catch(IllegalDateException e){
    	  assertTrue(false);
    	}
      	
      	try {
          y = 1;
          m = 6;
          d = 30;
          Date date25 = new Date(y, m, d);
          assertTrue(true);
        }catch(IllegalDateException e){
            assertTrue(false);
          }
      	try {
          y = 1;
          m = 6;
          d = 31;
          Date date26 = new Date(y, m, d);
          assertTrue(false);
        }catch(IllegalDateException e){
          assertTrue(true);
        }
      try {
          y = 1;
      	  m = 9;
      	  d = 1;
      	  Date date27 = new Date(y, m, d);
      	  assertTrue(true);
      	}catch(IllegalDateException e){
      	  assertTrue(false);
      	}
        	
      try {
        y = 1;
        m = 9;
        d = 30;
        Date date28 = new Date(y, m, d);
        assertTrue(true);
      }catch(IllegalDateException e){
          assertTrue(false);
        }
      try {
        y = 1;
        m = 9;
        d = 31;
        Date date29 = new Date(y, m, d);
        assertTrue(false);
      }catch(IllegalDateException e){
        assertTrue(true);
      }
      try {
	      y = 1;
	  	  m = 11;
	  	  d = 1;
	  	  Date date30 = new Date(y, m, d);
	  	  assertTrue(true);
	  	}catch(IllegalDateException e){
	  	  assertTrue(false);
	  	}
        	
      try {
        y = 1;
        m = 11;
        d = 30;
        Date date31 = new Date(y, m, d);
        assertTrue(true);
      }catch(IllegalDateException e){
          assertTrue(false);
        }
      try {
        y = 1;
        m = 11;
        d = 31;
        Date date32 = new Date(y, m, d);
        assertTrue(false);
      }catch(IllegalDateException e){
        assertTrue(true);
      }
      
    //Decision Table 4
      try {
	      y = 1;
	  	  m = 1;
	  	  d = 1;
	  	  Date date33 = new Date(y, m, d);
	  	  assertTrue(true);
	  	}catch(IllegalDateException e){
	  	  assertTrue(false);
	  	}
        	
      try {
        y = 1;
        m = 1;
        d = 31;
        Date date34 = new Date(y, m, d);
        assertTrue(true);
      }catch(IllegalDateException e){
          assertTrue(false);
        }
      try {
        y = 1;
        m = 1;
        d = 32;
        Date date35 = new Date(y, m, d);
        assertTrue(false);
      }catch(IllegalDateException e){
        assertTrue(true);
      }
      
      try {
	      y = 1;
	  	  m = 3;
	  	  d = 1;
	  	  Date date36 = new Date(y, m, d);
	  	  assertTrue(true);
	  	}catch(IllegalDateException e){
	  	  assertTrue(false);
	  	}
        	
      try {
        y = 1;
        m = 3;
        d = 31;
        Date date37 = new Date(y, m, d);
        assertTrue(true);
      }catch(IllegalDateException e){
          assertTrue(false);
        }
      try {
        y = 1;
        m = 3;
        d = 32;
        Date date38 = new Date(y, m, d);
        assertTrue(false);
      }catch(IllegalDateException e){
        assertTrue(true);
      }
      
      try {
	      y = 1;
	  	  m = 5;
	  	  d = 1;
	  	  Date date39 = new Date(y, m, d);
	  	  assertTrue(true);
	  	}catch(IllegalDateException e){
	  	  assertTrue(false);
	  	}
        	
      try {
        y = 1;
        m = 5;
        d = 31;
        Date date40 = new Date(y, m, d);
        assertTrue(true);
      }catch(IllegalDateException e){
          assertTrue(false);
        }
      try {
        y = 1;
        m = 5;
        d = 32;
        Date date41 = new Date(y, m, d);
        assertTrue(false);
      }catch(IllegalDateException e){
        assertTrue(true);
      }
      
      try {
	      y = 1;
	  	  m = 7;
	  	  d = 1;
	  	  Date date42 = new Date(y, m, d);
	  	  assertTrue(true);
	  	}catch(IllegalDateException e){
	  	  assertTrue(false);
	  	}
        	
      try {
        y = 1;
        m = 7;
        d = 31;
        Date date43 = new Date(y, m, d);
        assertTrue(true);
      }catch(IllegalDateException e){
          assertTrue(false);
        }
      try {
        y = 1;
        m = 7;
        d = 32;
        Date date44 = new Date(y, m, d);
        assertTrue(false);
      }catch(IllegalDateException e){
        assertTrue(true);
      }
      
      try {
	      y = 1;
	  	  m = 8;
	  	  d = 1;
	  	  Date date45 = new Date(y, m, d);
	  	  assertTrue(true);
	  	}catch(IllegalDateException e){
	  	  assertTrue(false);
	  	}
        	
      try {
        y = 1;
        m = 8;
        d = 31;
        Date date46 = new Date(y, m, d);
        assertTrue(true);
      }catch(IllegalDateException e){
          assertTrue(false);
        }
      try {
        y = 1;
        m = 8;
        d = 32;
        Date date47 = new Date(y, m, d);
        assertTrue(false);
      }catch(IllegalDateException e){
        assertTrue(true);
      }
      try {
	      y = 1;
	  	  m = 10;
	  	  d = 1;
	  	  Date date48 = new Date(y, m, d);
	  	  assertTrue(true);
	  	}catch(IllegalDateException e){
	  	  assertTrue(false);
	  	}
        	
      try {
        y = 1;
        m = 10;
        d = 31;
        Date date49 = new Date(y, m, d);
        assertTrue(true);
      }catch(IllegalDateException e){
          assertTrue(false);
        }
      try {
        y = 1;
        m = 10;
        d = 32;
        Date date50 = new Date(y, m, d);
        assertTrue(false);
      }catch(IllegalDateException e){
        assertTrue(true);
      }    

      try {
	      y = 1;
	  	  m = 12;
	  	  d = 1;
	  	  Date date51 = new Date(y, m, d);
	  	  assertTrue(true);
	  	}catch(IllegalDateException e){
	  	  assertTrue(false);
	  	}
        	
      try {
        y = 1;
        m = 12;
        d = 31;
        Date date52 = new Date(y, m, d);
        assertTrue(true);
      }catch(IllegalDateException e){
          assertTrue(false);
        }
      try {
        y = 1;
        m = 12;
        d = 32;
        Date date53 = new Date(y, m, d);
        assertTrue(false);
      }catch(IllegalDateException e){
        assertTrue(true);
      }
	}

    
    
    
    
    
    @Test
    void testGetYear()  {
	    // test Date construction
    	int y = 1;
    	int m = 1;
    	int d = 1;
    	try {
    	  Date date = new Date(y, m, d);
    	  assertEquals(1, date.getYear());
        }catch(IllegalDateException e) {}
	}
    
    @Test
    void testGetMonth()  {
	    // test Date construction
    	int y = 1;
    	int m = 1;
    	int d = 1;
    	try {
    	Date date = new Date(y, m, d);
    	assertEquals(1, date.getMonth());
    	}catch(IllegalDateException e) {}
	}
    
    @Test
    void testGetDay()  {
	    // test Date construction
    	int y = 1;
    	int m = 1;
    	int d = 1;
    	try {
    	  Date date = new Date(y, m, d);
    	  assertEquals(1, date.getDay());
    	}catch(IllegalDateException e) {}
	}
    
    @Test
    void testToString()  {
	    // test Date construction
    	int y = 1;
    	int m = 1;
    	int d = 1;
    	try {
    	  Date date = new Date(y, m, d);
    	  assertEquals("1/1/1", date.toString());
    	}catch(IllegalDateException e) {}
	}
}
