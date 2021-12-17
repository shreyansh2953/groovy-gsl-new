#!/usr/bin/env groovy

def call()
{


   node{
   stage('checkout')
    {
       sh "echo checkout"
    }
   stage('build')
    {
        sh "echo build"
           }
    stage('scan')
    {
       sh "echo scan"
    }
 }
}