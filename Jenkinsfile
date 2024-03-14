pipeline {
    agent any
    tools {
        // Define Maven tool installation
        maven 'MAVEN' // 'Maven' is the name given to the Maven installation in Jenkins Tools
    }

    stages {
        stage('Checkout') {
                steps {
                    // Checkout the code from the repository
                    checkout scm
                }
        }
        stage('Build') {
            steps {
                // Run mvn clean package -DskipTests
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Run tests') {
            steps {
                // Run mvn test
                sh 'mvn test'
            }
            post {
                always {
                    allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'target/allure-results']]
                    ])
                }
            }
        }
    }
}
