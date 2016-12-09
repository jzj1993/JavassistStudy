package com.jzj.groovy

import javassist.CtBehavior
import javassist.CtConstructor
import javassist.CtMethod
import javassist.bytecode.CodeAttribute
import javassist.bytecode.LineNumberAttribute

/**
 * JavassistUtil
 * Created by jzj on 2016/12/9.
 */
class JavassistUtil {

    public static int getBehaviourLength(CtBehavior behavior) {
        CodeAttribute ca = behavior.getMethodInfo().getCodeAttribute();
        if (ca == null) return -1;
        LineNumberAttribute info = (LineNumberAttribute) ca.getAttribute(LineNumberAttribute.tag);
        if (info == null) return -1;
        return info.tableLength();
    }

    public static int getConstructorLength(CtConstructor constructor) {
        return getBehaviourLength(constructor);
    }

    public static int getMethodLength(CtMethod method) {
        return getBehaviourLength(method);
    }

    public static boolean isEmptyMethod(CtMethod method) {
        return getMethodLength(method) < 2;
    }

    public static boolean isEmptyConstructor(CtConstructor constructor) {
        return getConstructorLength(constructor) < 4;
    }
}
