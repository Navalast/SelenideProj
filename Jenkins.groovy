pipeline {
    agent any

    stages {
        stage('Build and Test') {
            steps {
                script {
                    docker.image('my-jenkins').inside {
                        sh 'mvn clean install'
                    }
                }
            }
        }
    }
}