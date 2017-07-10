package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class MaxTest {
              @Test
    public void maxIsTwoNumber(){
                  Max maxResultTest = new Max();
                  int [] number = {1,2};
                  int expected = 2;
                  int result = maxResultTest.max(number [0],number [1]);
                  assertThat(result, is (expected));
    }
    public void maxIsTreeNumber(){
                  Max maxResultTest = new Max();
                  int [] number = {1,2,3};
                  int expected = 3;
                  int result = maxResultTest.max(number [0],number [1],number [2]);
                  assertThat(result, is (expected));
    }
}