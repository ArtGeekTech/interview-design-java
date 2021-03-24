package com.agt.effectivecleancode.design.immutable;

public class HackCrappyImmutableObject extends CrappyImmutableObject {

    private int hackField1;

    public HackCrappyImmutableObject(int field1, String field2, String[] field3) {
        super(field1, field2, field3);
    }

    @Override
    public int getField1() {
        return hackField1;
    }

    public void setHackField1(int hackField1) {
        this.hackField1 = hackField1;
    }
}
