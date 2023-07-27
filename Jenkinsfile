pipeline {
    agent any 

    parameters { string(name: 'ENV', description: 'enter the value')
    
    stages{
        stage("param1"){
            steps {
                build job: 'demo2', parameters: [string(name: 'env', value: 'qa'), string(name: 'browser', value: 'chrome'), string(name: 'test', value: "${params.ENV}")]
            }
        }
    }
}
