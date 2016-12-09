package com.jzj.groovy;

import javassist.ClassPool;
import javassist.CtBehavior;
import javassist.CtClass;
import javassist.NotFoundException;
import org.junit.Test;

/**
 * TestJavassist
 * Created by jzj on 2016/12/9.
 */
public class TestJavassist {

    @Test
    public void test() throws NotFoundException {
        ClassPool pool = ClassPool.getDefault();
        pool.appendClassPath(".");
        CtClass ctClass = pool.getCtClass("com.jzj.groovy.Test");
        CtBehavior[] declaredBehaviors = ctClass.getDeclaredBehaviors();
        System.out.print("end");
    }
}
