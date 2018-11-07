/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetest1;

/**
 *
 * @author d.yy
 */
public class TimeTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        long startTime = System.currentTimeMillis();
        
        long total = 0;
        for (int i=0; i<10000000; i++)
            total += i;
        
        long stopTime = System.currentTimeMillis();
        long elapsed = stopTime - startTime;
        
        System.out.println(elapsed);
    }
    
}
