package JAVA8Features;

import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashornExample {  
    public static void main(String[] args) throws Exception{  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        ee.eval(new FileReader("js/hellojava.js"));  
    }  
}