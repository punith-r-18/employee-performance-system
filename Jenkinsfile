pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean package'
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