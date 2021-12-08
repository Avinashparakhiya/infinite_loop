class one{
    String firstName;
    String lastName;
    int age;

    one(){
        firstName =null;
        lastName = null;
        age=0;
    }

    one(int a){
        age =a;
    }


    void firstMethod(String name)
    {
        this.firstName=name;
    }
}

class scanner{
    public static void main(String[] args) {
        one oneqw=new one();
        one two=new one(15);

        oneqw.firstMethod("avinash");
        System.out.println(oneqw.firstName);
        two.lastName="abhishek";
        System.out.println(two.lastName);


        String firstname ="firstname";
        System.out.println(firstname);
        System.out.println(oneqw.firstName);

    }
}