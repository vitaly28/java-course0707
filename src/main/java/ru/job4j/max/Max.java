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
*��������� ��������.
*
*@param a ������ ��������
*@param b ������ ��������
*@return ���������
*/  
  public int max(int a, int b){
    if (a > b){return a;}
    else {return b;}
  }

/**
*���������  ��������.
*
*@param a ������ ��������
*@param b ������ ��������
*@param c ������ ��������
*@return ���������
*/
  public int max(int a, int b,int c){

    return max(max(a,b),c);
  }
}
