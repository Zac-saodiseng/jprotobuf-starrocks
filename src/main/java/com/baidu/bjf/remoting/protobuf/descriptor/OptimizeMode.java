/*
 * Copyright (c) Baidu Inc. All rights reserved.
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.bjf.remoting.protobuf.descriptor;

import com.baidu.bjf.remoting.protobuf.EnumReadable;
import com.google.protobuf.DescriptorProtos.FileOptions;

/**
 * Enumeration mode for optimize defines at {@link FileOptions}.
 *
 * @author xiemalin
 * @since 2.0.1
 */
public enum OptimizeMode implements EnumReadable {
    
    /** The speed. */
    SPEED(1), 
 /** The code size. */
 CODE_SIZE(2), 
 /** The lite runtime. */
 LITE_RUNTIME(3);

    /** The value. */
    private int value;
    
    /**
     * Instantiates a new optimize mode.
     *
     * @param value the value
     */
    private OptimizeMode(int value) {
        this.value = value;
    }

    /* (non-Javadoc)
     * @see com.baidu.bjf.remoting.protobuf.EnumReadable#value()
     */
    @Override
    public int value() {
        return value;
    }

}
