pipeline {
    agent any
    stages {
        stage ('pull') {
            steps {
                echo 'pull completed'
            }
        }
        stage ('build') {
            steps {
                echo 'build completed'
            }
        }
        stage ('test') {
            steps {
                echo 'test completed'
            }
        }
        stage ('deploy') {
            steps {
                echo 'deploy complted'
            }
        }
    }
}