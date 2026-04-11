pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t punith3110/employee-app .'
            }
        }

        stage('Docker Push') {
            steps {
                bat 'docker push punith3110/employee-app'
            }
        }
    }
}