#!/usr/bin/env groovy
package com.files

class Buildclass implements Serializable {
    def steps
Buildclass(steps){this.steps = steps}
 def mvn(args) {
    steps.sh "${steps.tool 'myMaven'}/bin/mvn ${args}"
  }
    
}