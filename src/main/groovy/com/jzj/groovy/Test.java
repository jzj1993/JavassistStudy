package com.jzj.groovy;

/**
 * Test
 * Created by jzj on 2016/12/9.
 */
public class Test {

    public static final String CONST = "CONST_VAL";

    private String field = "Field";

    public Test() { // len = 3
    }

    public Test(String s) { // len = 4
        System.out.print(s);
    }

    public void empty() { // len = 1
    }

    public void setField(String field) { // len = 2
        this.field = field;
    }

    public String getField() { // len = 1
        return field;
    }

    public void func(String s) { // len = 2
        System.out.print(s);
    }

    public void func2(String s) { // len = 2
        System.out.print(s + s);
    }

    public void func3(String s) { // len = 3
        String s1 = s + s;
        System.out.print(s1);
    }
}
