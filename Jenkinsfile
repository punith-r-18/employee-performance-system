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
                sh '''
                docker run --rm \
                -v $WORKSPACE:/app \
                -w /app \
                maven:3.9.9-eclipse-temurin-17 \
                mvn clean package
                '''
            }
        }

        stage('Docker Build') {
            steps {
                sh '''
                docker build -t punith3110/employee-app .
                '''
            }
        }

        stage('Docker Push') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker-hub', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
                    sh '''
                    echo $PASS | docker login -u $USER --password-stdin
                    docker push punith3110/employee-app
                    '''
                }
            }
        }

    }
}