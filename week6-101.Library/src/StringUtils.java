/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielsepejr.
 */
public class StringUtils {
    public static boolean included(String word, String searched) {
        
        if (word.trim().toUpperCase().contains(searched.trim().toUpperCase())) {
            return true;
        }
        
        if (word.isEmpty() || searched.isEmpty()) {
            return false;
        }
        
        return false;
    }
    
}
