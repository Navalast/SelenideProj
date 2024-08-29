pipeline {
    agent any

    stages {
        stage('Build and Test') {
            steps {
                script {
                    docker.image('your-docker-image').inside {
                        sh 'mvn clean install'
                    }
                }
            }
        }
    }
}