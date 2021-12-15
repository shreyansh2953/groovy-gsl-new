#!/usr/bin/env groovy
package com.files

class Checkout implements Serializable{
    def steps
    Checkout(steps){this.steps = steps}

    def checkout(repo){
      steps.sh "git clone ${repo}"
    }
}