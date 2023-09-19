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
    public void isBalancedIfMultipleBracketsReturnsTrue() {
        assertTrue(org.launchcode.BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void failsIfNotBalanced(){
        assertFalse(org.launchcode.BalancedBrackets.hasBalancedBrackets("[]]"));
    }
    @Test
    public void failsIfBracketsBackwardsReturnFalse(){
        assertFalse(org.launchcode.BalancedBrackets.hasBalancedBrackets("]["));
    }

 @Test
    public void startsAndEndsWithBracketReturnsTrue() {
        assertTrue(org.launchcode.BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
 }
    @Test
    public void bracketsAreInTheMiddleOfStringReturnTrue() {
        assertTrue(org.launchcode.BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void bracketsAreAtTheBeginningOfStringReturnsTrue() {
        assertTrue(org.launchcode.BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void singleBracketAtBeginningOfStringReturnsFalse() {
        assertFalse(org.launchcode.BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void HasTwoBackwardsBracketsInMiddleOfStringReturnsFalse() {
        assertFalse(org.launchcode.BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void hasSingleBracketReturnFalse() {
            assertFalse(org.launchcode.BalancedBrackets.hasBalancedBrackets("["));
        }
    }
