#!/usr/bin/env groovy
package com.files

class Sonarscans implements Serializable {
    def steps
Buildclass(steps){this.steps = steps}
 def scan(args,tool) {
    steps.sh "${steps.tool 'myMaven'}/bin/mvn ${args}"
    
  }
    
}