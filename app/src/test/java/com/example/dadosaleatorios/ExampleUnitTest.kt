package com.example.dadosaleatorios

import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {


    @Test fun generateNumber(){
        val dice=Dice(6)
        val rollResult= dice.roll()
        assertTrue("the value of rollResult was not between 1 and 6" , rollResult in 1..6)
    }



}