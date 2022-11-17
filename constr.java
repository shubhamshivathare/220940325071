class Grandparent{
    public String Grandfathername, grandmothername;
    public Grandparent(String a,String b){
        Grandfathername=a;
        grandmothername=b;
        System.out.println(grandmothername);
        System.out.println(Grandfathername);
    }
}
class parent extends Grandparent{
    public String father,mother;
    public parent(String a,String b,String c,String d){
        this(c,d)
        father=a;
        mother=b;
        System.out.println(father);
        System.out.println(mother);
    }
    public parent(String a,String b){
        super(a,b);
    }
}
class child extends parent{
    child( String a,String b, String c, String d){
        super(a,b,c,d);
    }
    public static void main(String[]args){
        child c1=new child("father","mother","Grandfathername","grandmothername")
    }
}







