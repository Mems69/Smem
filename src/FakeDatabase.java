
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Somnia
 */
public class FakeDatabase {

    /**
     * @return the benefits
     */
    public static ArrayList<Object[]> getBenefits() {
        return benefits;
    }
    
    public static int size(){
        return benefits.size();
    }

    /**
     * @param aBenefits the benefits to set
     */
    public static void setBenefits(Object[] a) {
        benefits.add(a);
    }
    
    private static ArrayList<Object[]> benefits = new ArrayList<>();
}
