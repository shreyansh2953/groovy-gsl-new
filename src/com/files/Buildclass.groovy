#!/usr/bin/env groovy
package com.files

class Buildclass implements Serializable {
    def steps
Buildclass(steps){this.steps = steps}
 def mavenBuild(args,tool,filename) {
    steps.sh "cd ${filename}"
    steps.sh "pwd"
    steps.sh "ls"
    steps.sh "${tool}/bin/mvn ${args}"
    steps.sh "echo ${steps.env.BUILD_Id}"
  }
    
}