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
                sh 'mvn clean package'
            }
        }
    }
}