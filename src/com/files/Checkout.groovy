#!/usr/bin/env groovy
package com.files

class Checkout implements Serializable{
    def steps
    Checkout(steps){this.steps = steps}

    def checkgit(repo){
    //    steps.sh "git clone ${repo}"
     steps.checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: "${repo}"]]])
       
    }
}