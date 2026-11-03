pipeline {

    agent any

    parameters {
        choice(
            name: 'BROWSER',
            choices: ['chrome', 'firefox', 'edge'],
                description: 'Select browser'
        )
    }

    stages {

        stage('Check Project') {
            steps {
                bat '''
                echo Checking project folder...
                dir C:\\Users\\HP\\IdeaProjects\\CICD_Without_Git
                '''
            }
        }

        stage('Run Tests') {
            steps {
                dir('C:\\Users\\HP\\IdeaProjects\\CICD_Without_Git')
                {
                    bat "mvn clean test -Dbrowser=${params.BROWSER}"
                }
            }
        }
    }
}