node(label: "docker") {
  stage ("build") {
    checkout scm

    docker.build("flask-app:123123123", "flask/app")
  }
}
