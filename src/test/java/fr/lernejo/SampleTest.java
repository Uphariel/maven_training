package fr.lernejo;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @org.junit.jupiter.api.Test
    void op() {
        Sample s = new Sample();
        Assertions.assertEquals(2, s.op(Sample.Operation.ADD, 1, 1));
        Assertions.assertEquals(1, s.op(Sample.Operation.MULT, 1, 1));
    }

    @org.junit.jupiter.api.Test
    void fact() {
        Sample s = new Sample();
        Assertions.assertEquals(24, s.fact(4));
        try{
            s.fact(-10);
            fail("Should not Allow");
        } catch (IllegalArgumentException e)
        {}
    }
}
