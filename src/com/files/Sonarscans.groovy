#!/usr/bin/env groovy
package com.files

class Sonarscans implements Serializable {
    def steps
Sonarscans(steps){this.steps = steps}
 def scan(args,tool) {
    steps.withSonarQubeEnv(credentialsId: '7d113307-a77e-4c93-9e0c-a912ebd54db5') {
    steps.sh "${steps.tool 'myMaven'}/bin/mvn ${args}"
    
}
    
  }
    
}