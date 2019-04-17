package com.yhr.IOdemo.utils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @BelongsProject: IO_demo
 * @BelongsPackage: PACKAGE_NAME
 * @Author: yang
 * @CreateTime: 2019-04-16 10:00
 * @Description: ${Description}
 */
public final class Calculator {
    private final static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");
    public static Object cal(String expression) throws ScriptException {
        return jse.eval(expression);
    }

    public static void main(String[] args) throws ScriptException {
        String s = Calculator.cal("1+2").toString();
        System.out.println(s);
    }
}