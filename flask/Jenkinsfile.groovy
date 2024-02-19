node(label: "docker") {
  stage ("build") {
    checkout scm                  //копирование репозитория к себе

    docker.build("flask-app1:400402", "flask/app")
  }
}  
