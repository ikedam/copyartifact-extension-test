/*
 * The MIT License
 * 
 * Copyright (c) 2015 IKEDA Yasuyuki
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.jenkinsci.plugins.copyartifactextensiontest;

import org.kohsuke.stapler.DataBoundConstructor;

import hudson.Extension;
import hudson.plugins.copyartifact.BuildSelector;
import hudson.plugins.copyartifact.SimpleBuildSelectorDescriptor;

/**
 *
 */
public class UsingSimpleBuildSelectorDescriptorSelector extends BuildSelector {
    private final String field;
    
    @DataBoundConstructor
    public UsingSimpleBuildSelectorDescriptorSelector(String field) {
        this.field = field;
    }
    
    public String getField() {
        return field;
    }
    
    @Extension
    public static final SimpleBuildSelectorDescriptor DESCRIPTOR =
            new SimpleBuildSelectorDescriptor(
                    UsingSimpleBuildSelectorDescriptorSelector.class,
                    Messages._UsingSimpleBuildSelectorDescriptorSelector_DisplayName()
            );
}
