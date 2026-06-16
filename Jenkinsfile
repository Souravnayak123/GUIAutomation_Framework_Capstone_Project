pipeline {

    agent any

    tools {

        maven 'Maven3'
        jdk 'Java21'
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
    }

    post {

        success {

            echo 'Build Successful'
        }

        failure {

            echo 'Build Failed'
        }
    }
}