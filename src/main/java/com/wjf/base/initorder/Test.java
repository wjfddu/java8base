package com.wjf.base.initorder;

public class Test {


///*    private static long l = 0;
//    private double d = 0.0;
//    private static float f = 0.0F;
//    private static char c = '王';*/
//    private char c;
//    protected String name = "father";
//    int age = 30;
//
//    public static void main(String[] args) {
//        Test t = new Test();
//        System.out.println(t.c);
//    }
    static int i;

    static {
        System.out.println("静态方法块 1");
        i ++;
    }

    private static Son staticSon = new Son("静态属性 调用 构造方法");

    static {
        System.out.println("静态方法块 2");
    }

    {
        System.out.println("普通方法块 1");
    }

    private Son son = new Son("普通属性 调用 构造方法");

    {
        System.out.println("普通方法块 2");
    }

    public Test(){
        System.out.println("构造方法");
    }

    //private String name = "son";
    public static void main(String[] args) {
//        Son s = new Son("new对象 调用构造方法");
////        System.out.println(s.age);
////        System.out.println(s.name);

        Test t = new Test();
        System.out.println(i);
    }

}
