package com.lethanh98.DI_IN_SPRING.test.fix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FixTest1 {
    @Autowired
    FixTest2 Test2;

    public void setTest2(FixTest2 test2) {
        Test2 = test2;
    }
}
