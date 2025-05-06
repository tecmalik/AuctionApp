package org.acalltoauction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassWorkTest {
    @Test
    public void testClassWork() {
        ClassWork classWork = new ClassWork();
        assertEquals(10,classWork.sumMissingStringNumbers("0,5"));
        assertEquals(5,classWork.sumMissingStringNumbers("1,2,3,4,6,7"));
    }
    @Test
    public void IfSpacesAreIncludedInInput() {
        ClassWork classWork = new ClassWork();
        assertEquals(10,classWork.sumMissingStringNumbers("0 ,5"));
        assertEquals(5,classWork.sumMissingStringNumbers(" 1,2,3, 4,6,7" ));
    }


}