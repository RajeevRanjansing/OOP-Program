class A extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println("Inside class A: "+i);
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Inside class B: "+i);
        }
    }
}
class C extends Thread{
    public void run(){
        for(int i=1;i<=7;i++){
            System.out.println("Inside class c: "+i);
        }
    }
}
class program17{
    public static void main(String args[]){
        A a=new A();
        B b=new B();
        C c=new C();
        a.start();
        b.start();
        c.start();
    }
}

output is
Inside class c: 1
Inside class c: 2
Inside class c: 3
Inside class c: 4
Inside class B: 1
Inside class B: 2
Inside class A: 1
Inside class A: 2
Inside class c: 5
Inside class B: 3
Inside class A: 3
Inside class c: 6
Inside class c: 7
Inside class B: 4
Inside class B: 5
