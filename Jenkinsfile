pipeline {
    agent any
    tools {
        maven 'MAVEN3'
        jdk 'JDK9'
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean install'
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {

                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
