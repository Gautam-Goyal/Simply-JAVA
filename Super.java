class A{
  int x=6;
  int show(){
    System.out.printf("=%d",x);
    return x;
  };
}

class B extends A{
  int x=5;
  int show() {
    super.x=3;
    super.show();
    return x*4;
  }
  void show2(){
    System.out.printf("!!!!!!!!!!!");
  }
}

class Main {
  public static void main(String[] args) {
    A o1=new B();
    B o2=new B();
    System.out.print(o1.show());
    o1.show2();//error
    o2.show();
  }
}
