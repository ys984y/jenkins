pipeline {
    agent any 

    parameters { string(name: 'ENV', description: 'enter the value')
    
    stages{
        stage("param1"){
            steps {
                build job: 'Git_job2', parameters: [string(name: 'ENV', value: "${params.ENV}")]
            }
        }
    }
}
