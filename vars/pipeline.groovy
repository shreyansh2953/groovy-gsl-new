#!/usr/bin/env groovy
import src.com.files.*;
def call()
{


   node{
    // def lib = library 'my-test-library'
    // def obj = lib.com.files;
    def mytool = tool 'myMaven'
    def repo_file="myfile"
    stage('checkout')
    {
         deleteDir()
        def my_git = Checkout.new(this)
        my_git.checkgit("https://github.com/shreyansh2953/JavaCalculator.git")
    }
   stage('build')
    {
        def my_build =Buildclass.new(this)
        my_build.mavenBuild("clean",mytool,repo_file)
    }
    stage('scan')
    {
        def my_scan = Sonarscans.new(this)
        my_scan.scan("sonar:sonar",mytool)
    }
 }
}