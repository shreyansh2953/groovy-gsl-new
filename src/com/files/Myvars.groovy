#!/usr/bin/env groovy
package com.files

class Myvars{
    static String place = "Delhi";

    def sayHii(name)
    {
        echo "hii ${name} from ${place}"
    }
}