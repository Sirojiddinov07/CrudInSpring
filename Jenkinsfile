groovy
pipeline {
    agent any

    stages {
        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('SonarQube Check') {
            steps {
                sh 'mvn sonar:sonar'
            }
        }

        stage('Build Deployable War Artifact') {
            steps {
                sh 'mvn package'
            }
        }
    }
}
