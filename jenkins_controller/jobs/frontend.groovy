pipelineJob('frontend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/gajdamariusz84/Frontend.git")
                    }
                    branches('tests')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}