node{
    stage ('pull'){
        echo 'pull successful'
    }
    stage('build'){
        echo 'build suceessful'
    }
    stage('test'){
        echo 'test suceesful'
    }
    stage(deploy){
        echo 'deploy succeesful'
    }
}