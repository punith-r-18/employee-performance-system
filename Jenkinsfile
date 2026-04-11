pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh '''
                docker run --rm \
                -v $WORKSPACE:/tmp/workspace \
                maven:3.9.9-eclipse-temurin-17 \
                bash -c "cp -r /tmp/workspace/* /app && cd /app && mvn clean package"
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