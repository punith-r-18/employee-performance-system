pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh 'ls -l'
                sh '''
                docker run --rm \
                -v $WORKSPACE:/workspace \
                -w /workspace \
                maven:3.9.9-eclipse-temurin-17 \
                mvn clean package
                '''
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