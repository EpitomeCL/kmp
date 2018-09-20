/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package org.bitcoin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NativeSecp256k1Util {
    private static final Logger log = LoggerFactory.getLogger(NativeSecp256k1Util.class);

    public static void assertEquals(int val, int val2, String message) throws AssertFailException {
        if (val != val2) {
            throw new AssertFailException("FAIL: " + message);
        }
    }

    public static void assertEquals(boolean val, boolean val2, String message) throws AssertFailException {
        if (val != val2) {
            throw new AssertFailException("FAIL: " + message);
        }
        log.debug("PASS: " + message);
    }

    public static void assertEquals(String val, String val2, String message) throws AssertFailException {
        if (!val.equals(val2)) {
            throw new AssertFailException("FAIL: " + message);
        }
        log.debug("PASS: " + message);
    }

    public static class AssertFailException
    extends Exception {
        public AssertFailException(String message) {
            super(message);
        }
    }

}

