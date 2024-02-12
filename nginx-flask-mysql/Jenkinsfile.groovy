// pipeline {
//     agent {
//       label "docker"
//     }

//     stages {
//         stage('Build backend image') {
//             steps {
//                 echo 'Building backend image'
//                 docker.build("flaskbackend", "-f ./backend/Dockerfile")
//             }
//         }
//         stage('Build nginx image') {
//             steps {
//                 echo 'Building nginx image'
//                 def nginxImage = docker.build("nginx", "-f ./proxy/Dockerfile")
//             }
//         }
//         stage('Test') {
//             steps {
//                 echo 'Testing..'
//             }
//         }
//         stage('Deploy') {
//             steps {
//                 echo 'Deploying....'
//             }
//         }
//     }
// }

node (label: "build") {
    stage("build nginx image") {
        def customImage = docker.build("nginx-image:${env.BUILD_ID}", "./proxy/Dockerfile")

        customImage.inside {
            sh 'echo yoyo'
        }
    }
}
