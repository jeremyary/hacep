/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package it.redhat.hacep.console;

import it.redhat.hacep.console.commands.ConsoleCommand;

import java.io.IOException;

public class NullUI implements UI {

    @Override
    public void print(Object message) {
    }

    @Override
    public void println(Object message) {
    }

    @Override
    public void print(String message) {
    }

    @Override
    public void println(String message) {
    }

    @Override
    public void println() {
    }

    @Override
    public void printUsage() {
    }

    @Override
    public void start() throws IOException {
    }

    @Override
    public UI register(ConsoleCommand cmd) {
        return null;
    }

}