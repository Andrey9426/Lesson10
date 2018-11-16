
public class A {
    public void m1() {
        System.out.println("m1 From A");
    }
}

class B extends A {
    public void m2() {
        System.out.println("m2 from B");
    }
}


class C extends B {
    public void m3() {
        System.out.println("m3 from C");
    }

    @Override
    public void m2() {
        System.out.println("m2 from C");
    }
    public void m1(){
        System.out.println("m1 from c");
    }
}


class D extends B {
    public void m4() {
        System.out.println("m4 from D");
    }

    public void m1() {
        System.out.println("m1 from D");
    }
}

class RunPolymorphism{
    public static void main(String[] args) {
        A a=new A();
        a.m1();
        A b1=new B();
        B b2=new B();
        b1.m1();
        b1.m2();
        b2.m1();
        b2.m2();
        A c1=new C();
        B c2=new C();
        C c3=new C();
        c1.m1();     // m1 from C
        c1.m2();   // ----
        c2.m2();  //m2 from C
        c2.m3();  //------
        c3.m1();  //  m1 from C
        c3.m2(); // m2 from C
        c3.m3(); // m3 from C

    }
}
