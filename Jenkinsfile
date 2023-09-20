#!/usr/bin/env groovy
pipeline {
    agent any
    stages {
        stage('Stage 1'){
            steps {
                echo 'Hello world!'
            }
        }
        stage('Build') {
            steps {
                // Build your project
                bat 'mvnw clean install'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('sonar-scanner') {
                    // Run SonarQube analysis
                    bat 'sonar-scanner'
                }
            }
        }
        }
    }
