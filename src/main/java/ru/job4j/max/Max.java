package ru.job4j.max;
/**
* Package for Max.
*
* @author Vitaly Berstenev(sm_plus82@mail.ru)
* @version $Id$
* @since 0.1
*/
public class Max {

/**
*Сравнение максимум.
*
*@param a first argument
*@param b second argument
*@return result
*/  
  public int max(int a, int b){
    if (a > b){return a;}
    else {return b;}
  }

/**
*Comparison maximum
*
*@param a first arguments
*@param b secont arguments
*@param c tree arguments
*@return result
*/
  public int max(int a, int b,int c){

    return max(max(a,b),c);
  }
}
