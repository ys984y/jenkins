def jenkinsfile = "Jenkinsfile"

def HEADER = '''
<h4 style="color:blue;">Test Pipeline</h4>
'''.stripIndent()

pipelineJob("DemoPipeline") {
    description "${HEADER}"
    concurrentBuild(allowConcurrentBuild = true)
    parameters {

        stringParam (
            'ENV',
            'Please input env'
        )
  
    }

    


    logRotator(daysToKeep = 50, numToKeep = -1, artifactDaysToKeep = -1, artifactNumToKeep = -1)
    definition {
        cps {
            sandbox()
            script(readFileFromWorkspace(jenkinsfile))
        }
    }
}
