pipeline{
    agent any
    stages{
        stage("build"){
            steps{
            sh "mvn test"
            }
        }
        stage("Test"){
            steps{
            echo 'Testing'
            }
        }
    }
}
