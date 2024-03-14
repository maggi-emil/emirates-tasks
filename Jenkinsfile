pipeline {
    agent any

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
                    // Generate Allure report
                    allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'target/surefire-reports']]
                    ])
                }
            }
        }
    }
}
