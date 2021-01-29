package com.cristik.test.spring;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ResolvableType;
import org.springframework.util.MultiValueMap;

import java.lang.reflect.Array;

public class ResolvableTypeTest {

    private static final Logger logger = LoggerFactory.getLogger(ResolvableTypeTest.class);

    @Test
    public void test() {
        ResolvableType superResolvableType = ResolvableType.forClass(Array.class).getSuperType();
        logger.info("supper:" + superResolvableType.resolveGenerics());
    }

    @Test
    public void test2() {
        ResolvableType formDataType = ResolvableType.forClassWithGenerics(MultiValueMap.class, String.class, String.class);
        System.out.println(formDataType);
    }

}
