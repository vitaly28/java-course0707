package com.company;

public class Max {
  public static void main(String[] args) {
    Max cat = new Max();
    Max cat1 = new Max();
    System.out.println(cat.max(1,2));
    System.out.println(cat.max(10,0,3));

  }
  public int max(int a, int b){
    if (a > b){return a;}
    else {return b;}
  }
  public int max(int a, int b,int c){

    return max(max(a,b),c);
  }
}
