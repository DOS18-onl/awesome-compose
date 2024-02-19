node(label: "docker") {
  stage ("build") {
    checkout scm                  //копирование репозитория к себе

    docker.build("flask-app:400401", "flask/app")
  }
}  
