pipeline{
    agent any
    stages{
        stage('pull'){
            steps{
                git https://github.com/nehac8888/studentapp.ui.git
                echo 'pull completed'
            }
        }
        stage('stage'){
            steps{
                echo 'test completed'
            }
        }
        stage('build'){
            steps{
                echo 'build completed'
            }
        }
        stage('deploy'){
            steps{
                echo 'deploy completed'
            }
        }
    }
}