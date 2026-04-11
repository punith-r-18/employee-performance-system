pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/punith-r-18/employee-performance-system.git'
            }
        }

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