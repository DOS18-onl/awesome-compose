pipeline {
    agent {
      label "docker"
    }

    stages {
        stage('Build backend image') {
            steps {
                echo 'Building backend image'
                backendImage = docker.build("flaskbackend", "./backend/Dockerfile")
            }
        }
        stage('Build nginx image') {
            steps {
                echo 'Building nginx image'
                def nginxImage = docker.build("nginx", "./proxy/Dockerfile")
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
