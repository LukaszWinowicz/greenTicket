/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greenticket;

/**
 *
 * @author Lucas
 */
public class GreenTicket {

    public static Integer greenTicket(Integer a, Integer b, Integer c) {
        if (a == b) {
            if (b == c) {
                return 20;
            }
            return 10;
        }
        if (a == c || b == c) {
            return 10;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println(greenTicket(1, 1, 2));
    }
    
}
