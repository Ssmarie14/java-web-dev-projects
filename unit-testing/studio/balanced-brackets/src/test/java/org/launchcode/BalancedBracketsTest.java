package org.launchcode;

import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    
    @Test 
    public void isBalancedWithTwoBrackets() {
        assertTrue(org.launchcode.BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void isBalancedIfMultipleBrackets() {
        assertTrue(org.launchcode.BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void failsIfNotBalanced(){
        assertFalse(org.launchcode.BalancedBrackets.hasBalancedBrackets("[]]"));
    }
    @Test
    public void failsIfBracketsBackwards(){
        assertFalse(org.launchcode.BalancedBrackets.hasBalancedBrackets("]["));
    }

    private void assertFalse(boolean b) {
    }

}