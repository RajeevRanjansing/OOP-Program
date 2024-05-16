//1st program
//Example of copy constructor

class program8{
    String name;int age;
    program8(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("my name is "+name + " and age is "+age);
    }

    program8(program8 ref){
        name=ref.name;
        age=ref.age;
    
    System.out.println("my name is "+name + " and age is "+age);
        
    }
    public static void main(String args[]){
        program8 a= new program8("Rajeev",20);
        program8 b= new program8(a);
        
    }
}

//2nd program
//Default constructor

class program8{
    program8(){
        System.out.println("Rajeev kumar");
    }
    public static void main(String args[]){
        program8 a=new program8();
    }
}


//3rd program 
//parameterised constructor

class program8{
    program8(int a,int b){
        System.out.println("Addition of a and b is "+(a+b));
    }
    public static void main(String args[]){
        program8 a=new program8(10,20);
    }
}