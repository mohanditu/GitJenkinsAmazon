pipeline {
    agent any


    stages {
        stage('Build') {
            steps {
                echo 'Build Stage'
               
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy Stage'
                
            }
        }
        stage('Test') {
            steps {
                echo 'Test Stage'
                build 'AmazonSmokeTestSuite'
                publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: '', reportFiles: './test-output/index.html', reportName: 'HTML Report', reportTitles: '', useWrapperFileDirectly: true])
            }
        }
        stage('Release') {
            steps {
                echo 'Release Stage'
              
            }
        }
    }
}
