pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh 'docker run --rm -v $PWD:/workspace -w /workspace/EmployeePerformanceSystem maven:3.9.9-eclipse-temurin-17 mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t punith3110/employee-app EmployeePerformanceSystem'
            }
        }

        stage('Docker Push') {
            steps {
                sh 'docker push punith3110/employee-app'
            }
        }
    }
}