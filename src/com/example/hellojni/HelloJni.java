/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.hellojni;

import java.lang.reflect.Field;





public class HelloJni
{
    /** Called when the activity is first created. */
    
	
    static {
       System.loadLibrary("/Users/usuario/Documents/Titanium_Studio_Workspace/myLibraryJAR/libs/x86/");
    }
    
    
    /* A native method that is implemented by the
     * 'hello-jni' native library, which is packaged
     * with this application.
     */
    public native String  stringFromJNI();

    /* This is another native method declaration that is *not*
     * implemented by 'hello-jni'. This is simply to show that
     * you can declare as many native methods in your Java code
     * as you want, their implementation is searched in the
     * currently loaded native libraries only the first time
     * you call them.
     *
     * Trying to call this function will result in a
     * java.lang.UnsatisfiedLinkError exception !
     */
    public native String  unimplementedStringFromJNI();

    /* this is used to load the 'hello-jni' library on application
     * startup. The library has already been unpacked into
     * /data/data/com.example.hellojni/lib/libhello-jni.so at
     * installation time by the package manager.
     */
    
    public static void main(String[] args) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
    	//System.setProperty("java.library.path","/Users/usuario/Documents/Titanium_Studio_Workspace/myLibraryJAR/libs/x86/libhello-jni.so");
    	System.setProperty( "java.library.path", "/Users/usuario/Documents/Titanium_Studio_Workspace/myLibraryJAR/libs/" );
  
    	Field fieldSysPath = ClassLoader.class.getDeclaredField( "sys_paths" );
    	fieldSysPath.setAccessible( true );
    	fieldSysPath.set( null, null );
    	
    	System.out.println(System.getProperty( "java.library.path"));
    	//System.out.println(new HelloJni().stringFromJNI());
    	
    	
    	
    }

}
