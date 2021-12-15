#!/usr/bin/env groovy

def call(args,tool) {
    
    sh "${tool}/bin/mvn ${args}"
}