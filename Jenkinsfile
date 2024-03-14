pipeline {
    agent any

    stages {
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
