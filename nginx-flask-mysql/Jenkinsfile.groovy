pipeline {
    agent {
      label "docker"
    }

    stages {
        stage('Build backend image') {
            steps {
                echo 'Building backend image'
                def backendImage = docker.build("flaskbackend", "./backend/Dockerfile")
            }
        }
        stage('Build nginx image') {
            steps {
                echo 'Building nginx image'
                def backendImage = docker.build("nginx", "./proxy/Dockerfile")
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
