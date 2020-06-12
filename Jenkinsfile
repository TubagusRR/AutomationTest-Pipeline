pipeline {
    agent any

    stages {
        stage ("Compile Stage"){

            steps {
                withMaven(maven : 'maven') {
                    bat 'mvn clean compile'
                }
            }
        }

        stage("Testing Stage"){
            parallel {
                stage('Test on Android'){
                    agent{
                        label "Android"
                    }
                     steps {
                        withMaven(maven : 'maven'){
                            bat 'mvn test'
                            }
                    }
                }

                stage('Test on Iphone'){
                    agent{
                        label "Iphone"
                    }
                    steps {
                        withMaven(maven : 'maven'){
                             echo "Iphone Parallel Test"
                            }
                       }
                  }
             }
         }

        stage("Deployment Stage"){

            steps{
                withMaven(maven : 'maven'){
                    bat 'echo "This is Deployed"'
                }
            }
        }
    }
}