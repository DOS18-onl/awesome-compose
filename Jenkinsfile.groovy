node(label: "docker") {
  stage ("build") {
    check scm                  //копирование репозитория к себе

    dicker.build("flask-app:400400", "flask/app")
  }
}  
