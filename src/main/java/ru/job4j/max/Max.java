package ru.job4j.max;

public class Max {
  
  public int max(int a, int b){
    if (a > b){return a;}
    else {return b;}
  }
  public int max(int a, int b,int c){

    return max(max(a,b),c);
  }
}
