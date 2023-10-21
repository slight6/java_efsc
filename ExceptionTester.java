/* 
 * Author: Jason Consiglio
 * Date: 10/18/2023
 */

import java.io.IOException;

// Create the ExceptionA and ExceptionB classes
 
class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

// I wasn't sure if I should extend ExceptionA with ExceptionB or Exception

class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);
    }
}

// Test drive class

class ExceptionTester {
    public static void main(String[] args) {
        // Out of habit, I put everything in a try/catch block as a 'catch all'
        // Not sure if this is a good or bad thing. 
        try {
            try {
                throw new ExceptionA("ExceptionA Error");
            } catch (Exception ex) {
                System.out.println("Caught: " + ex.getMessage());
            }

            try {
                throw new ExceptionB("ExceptionB Error");
            } catch (Exception ex) {
                System.out.println("Caught: " + ex.getMessage());
            }

            try {
                throw new IOException("IOException Error");
            } catch (Exception ex) {
                System.out.println("Caught: " + ex.getMessage());
            }

            try {
                throw new NullPointerException("NullPointerException Error");
            } catch (Exception ex) {
                System.out.println("Caught: " + ex.getMessage());
            }
        } catch (Exception ex) {
            System.out.println("Caught: " + ex.getMessage());
        }
    }
}
