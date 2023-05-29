pipelineJob('backend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/gajdamariusz84/Backend.git")
                    }
                    branches('tests')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}