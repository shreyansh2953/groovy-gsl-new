#!/usr/bin/env groovy
package com.files

class Myvars implements Serializable{
    static String place = "Delhi";

    def sayHii(name)
    {
        return "hii ${name}"
        
    }
}