pipeline {
    agent any

    stages {
        stage('Build and Test') {
            steps {
                script {
                    docker.image('my-jenkins-container').inside {
                        sh 'mvn clean install'
                    }
                }
            }
        }
    }
}