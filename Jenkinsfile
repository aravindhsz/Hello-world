properties([parameters([[$class: 'ChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: '', filterLength: 1, filterable: false, name: 'first', randomName: 'choice-parameter-11130887035000', script: [$class: 'GroovyScript', fallbackScript: [classpath: [], sandbox: false, script: ''], script: [classpath: [], sandbox: false, script: 'return["master","branch1","branch2"]']]]])])node {
    def app

    stage('Clone repository') {
        /* Cloning the Repository to our Workspace */

        checkout scm
    }

    stage('Build image') {
        

        app = docker.build("aravindhsz/helloworld_using_pipeline")
    }

    

  
}
