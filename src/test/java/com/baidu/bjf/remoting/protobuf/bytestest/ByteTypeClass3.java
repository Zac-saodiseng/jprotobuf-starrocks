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
package com.baidu.bjf.remoting.protobuf.bytestest;

import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

/**
 * Test single private byte array field with getter and setter method
 *  
 * @author xiemalin
 * @since 1.0.9
 */
public class ByteTypeClass3 {
    @Protobuf
    private byte[] bytes;

    /**
     * get the bytes
     * @return the bytes
     */
    public byte[] getBytes() {
        return bytes;
    }

    /**
     * set bytes value to bytes
     * @param bytes the bytes to set
     */
    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}
