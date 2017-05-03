/*
 Copyright 2016 Goldman Sachs.
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 KIND, either express or implied.  See the License for the
 specific language governing permissions and limitations
 under the License.
 */

package com.gs.fw.common.mithra.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class MithraSybaseTestSuite 
extends TestSuite
{

    public static Test suite()
    {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(SybaseTrailingSpacesTest.class);
        suite.addTestSuite(SybaseBcpTest.class);
        suite.addTestSuite(SybaseBcpTestWithCustomTempDB.class);
        suite.addTestSuite(TestSybaseRetryAfterTimeout.class);
        suite.addTestSuite(TestUniqueIndexViolationExceptionForSybase.class);
        suite.addTestSuite(TestSybaseGeneralTestCases.class);
        return suite;
    }
}