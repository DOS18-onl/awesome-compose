pipeline {
    agent {
      label "docker"
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building.123.'
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
