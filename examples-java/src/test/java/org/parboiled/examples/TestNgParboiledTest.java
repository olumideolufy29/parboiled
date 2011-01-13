package org.parboiled.examples;

import org.parboiled.test.ParboiledTest;
import org.testng.Assert;

public class TestNgParboiledTest<V> extends ParboiledTest<V> {

    @Override
    protected void fail(String message) {
        Assert.fail(message);
    }

    @Override
    protected void assertEquals(Object actual, Object expected) {
        Assert.assertEquals(actual, expected);
    }
}

