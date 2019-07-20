public class lesson{
  public static void main(String[] args){

    for(int g = 1; g <= 50; g++){
      System.out.println(g);
    }

int m = 1;
int j = 0;
  while(m <= 10){
  System.out.println(m);
    m = m + 1;
}

m = 1;
j = 0;
  while(m <= 10){
    j = j + m;
    m = m + 1;
  }
      System.out.println(j);

int sum = 0;
int number = 4;
while(number <= 100){
  if(number%5 == 1 || number%5 == 4){
    System.out.println(number);
    number = number + 2;
  }else{
    number = number + 2;
}
}

int blue = 3;
while(blue <= 100){
  if(blue%12 == 0){
    blue = blue + 1;

  }else if(blue%3 ==0 || blue%4 == 0){
    System.out.println(blue);
    blue = blue + 1;
  }else{
    blue = blue + 1;
  }

  }
  int Ashley = 1;
  int Alice = 1;
  while(Alice <= 100){
    System.out.println(Ashley);
    System.out.println(Alice);
    System.out.println(Ashley + Alice);
    Ashley = Ashley + 2*Alice;
    Alice = 2*Ashley - Alice;




  }


}

}
