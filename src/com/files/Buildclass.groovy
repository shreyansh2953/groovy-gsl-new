#!/usr/bin/env groovy
package com.files

class Buildclass implements Serializable {
    def steps
Buildclass(steps){this.steps = steps}
 def mvn(args,tool) {
    
    steps.sh "${tool}/bin/mvn ${args}"
    steps.sh "echo ${steps.env.BUILD_Id}"
  }
    
}