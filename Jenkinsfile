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
            post {
                always{
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'cp target/helloWorld-1.0-SNAPSHOT.jar ~/deploy/'
            }
        }
    }
}
