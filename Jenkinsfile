pipeline {

    agent any

    tools {

        maven 'Maven'
        jdk 'JDK21'
    }

    stages {

        stage('Checkout Code') {

            steps {

                git branch: 'main',
                url: 'https://github.com/Souravnayak123/GUIAutomation_Framework_Capstone_Project.git'
            }
        }

        stage('Build') {

            steps {

                bat 'mvn clean compile'
            }
        }

        stage('Run Tests') {

            steps {

                bat 'mvn test'
            }
        }

        stage('Generate Report') {

            steps {

                publishHTML([
                    allowMissing: true,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'reports',
                    reportFiles: 'ExtentReport.html',
                    reportName: 'Extent Report'
                ])
            }
        }
    }

    post {

        always {

            archiveArtifacts artifacts: 'reports/*.html',
            allowEmptyArchive: true

            archiveArtifacts artifacts: 'screenshots/*.png',
            allowEmptyArchive: true
        }

        success {

            echo 'Build Successful'
        }

        failure {

            echo 'Build Failed'
        }
    }
}