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

            steps {
                parallel (
                    withMaven(maven : 'maven'){
                         a : {
                            bat 'mvn test'
                           },
                         b : {
                            echo "This is Parallel"
                        }
                    )
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