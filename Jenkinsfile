ipeline {
  agent any
  stages {
    stage('Checkout Scm') {
      steps {
        git 'https://github.com/Ramesvar/TestNG.git'
      }
    }

    stage('Shell script 0') {
      steps {
        sh 'sh "mvn test"'
      }
    }

  }
}
