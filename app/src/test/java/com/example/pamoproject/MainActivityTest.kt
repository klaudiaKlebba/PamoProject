package com.example.pamoproject


import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4





@RunWith(JUnit4::class)
class MainActivityTest{
     @Test
    fun whenInputIsValid(){
        val temp = 323.15
        val result = MainActivity().kelvinToCelsius(temp)
        assertEquals("passed",50.00,result)


    }


}


