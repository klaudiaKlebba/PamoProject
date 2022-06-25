package com.example.pamoproject


import com.example.pamoproject.POJO.Main
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MainActivityTest{
     @Test
    fun kelvinTest(){
        val temp = 323.15
        val result = MainActivity().kelvinToCelsius(temp)
        assertEquals("passed",50.00,result)
    }
}


