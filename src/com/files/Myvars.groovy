#!/usr/bin/env groovy
package com.files

class Myvars implements Serializable{
    static String place = "Delhi";

def myclouseres = {
    name->
    echo "hii ${name} from ${place}"
}
    def sayHii(name,clouser=myclouseres)
    {
        clouser.call(name);
    }
}