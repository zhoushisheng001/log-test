package com.zhuguang.zhou;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Test01 {

      @Test
     public void testSlf4j() {
           Logger logger = LoggerFactory.getLogger(Object.class);
           logger.warn("123");
           logger.error("123");
       }

      @Test
      public void test02 () {
          String name = "jiangxi=nanzhang=wuhang";
          String[] split = name.split("=", 2);
          System.out.println(Arrays.asList(split));
      }
}
