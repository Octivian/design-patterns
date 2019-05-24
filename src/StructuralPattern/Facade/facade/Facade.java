package StructuralPattern.Facade.facade;

import StructuralPattern.Facade.subSystem.ModuleA;
import StructuralPattern.Facade.subSystem.ModuleB;
import StructuralPattern.Facade.subSystem.ModuleC;

public class Facade {

    private ModuleA a;
    private ModuleB b;
    private ModuleC c;

    public Facade() {
        a = new ModuleA();
        b = new ModuleB();
        c = new ModuleC();
    }

    public void test() {
        a.testA();
        b.testB();
        c.testC();
    }
}
