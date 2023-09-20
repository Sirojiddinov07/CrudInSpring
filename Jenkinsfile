#!/usr/bin/env groovy
pipeline {
    agent any
    stages {
        stage('Stage 1'){
            steps {
                echo 'Hello world!'
            }
        }


        stage('SonarQube Analysis') {
            steps {
                wwithSonarQubeEnv('sonar-scanner', envOnly: true) {
                    // This expands the evironment variables SONAR_CONFIG_NAME, SONAR_HOST_URL, SONAR_AUTH_TOKEN that can be used by any script.
                    println ${env.SONAR_HOST_URL}
                }
            }
        }
        }
    }
