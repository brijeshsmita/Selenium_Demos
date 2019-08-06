/**
 * 
 */
package com.cg.mvc.utils;

import java.util.regex.Pattern;

/**
 * @author Brijesh
 *
 */
public class Utils {
    
    public static boolean isStringNumeric(String str) {
       /* final String Digits = "(\\p{Digit}+)";
        final String HexDigits = "(\\p{XDigit}+)";
        final String Exp = "[eE][+-]?" + Digits;
        final String fpRegex = ("[\\0\\x20]*[+-]?(NaN|Infinity|(((" + Digits
                + "(\\.)?(" + Digits + "?)(" + Exp + ")?)|(\\.(" + Digits
                + ")(" + Exp + ")?)|(((0[xX]" + HexDigits + "(\\.)?)|(0[xX]"
                + HexDigits + "?(\\.)" + HexDigits + ")" + ")[pP][+-]?"
                + Digits + "))[fFdD]?))[\\0\\x20]*");*/
        if (Pattern.matches("[^0-9$]+", str)) {
            return true;
        }else
        {
        return false;
        }
    }
     
}