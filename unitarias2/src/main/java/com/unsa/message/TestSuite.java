package com.unsa.message;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class TestSuite {
    @RunWith(Suite.class)
    @Suite.SuiteClasses(
        {
            TestJUnit1.class,
            TestJUnit2.class
        }
    )
    public class JUnitTestSuite {
    }
}
