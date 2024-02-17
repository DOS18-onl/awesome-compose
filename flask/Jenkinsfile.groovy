node(label: "docker") {
  stage ("build") {
    checkout scm // склонировать репозиторий 
    docker.build("flask-app:123123123", "flask/app") // искать докер файл в flask/app
  }
}
