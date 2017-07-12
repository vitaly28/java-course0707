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
*@param a первый аргумент
*@param b второй аргумент
*@return результат
*/  
  public int max(int a, int b){
    if (a > b){return a;}
    else {return b;}
  }

/**
*Сравнение  максимум.
*
*@param a первый аргумент
*@param b второй аргумент
*@param c третий аргумент
*@return результат
*/
  public int max(int a, int b,int c){

    return max(max(a,b),c);
  }
}
