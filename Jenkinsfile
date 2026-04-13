pipeline {
    agent any

    stages {

        stage('Checkout SCM') {
            steps {
                git branch: 'main', url: 'https://github.com/punith-r-18/employee-performance-system.git'
            }
        }

        stage('Build') {
            steps {
                sh 'docker run --rm -v $PWD:/app -w /app maven:3.9.9-eclipse-temurin-17 mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t punith3110/employee-app .'
            }
        }

        stage('Docker Push') {
            steps {
                sh 'docker push punith3110/employee-app'
            }
        }
    }
}