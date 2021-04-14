propertiesproperties([parameters([[$class: 'ChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: '', filterLength: 1, filterable: false, name: 'first', randomName: 'choice-parameter-11407894457800', script: [$class: 'GroovyScript', fallbackScript: [classpath: [], sandbox: false, script: ''], script: [classpath: [], sandbox: false, script: 'return["master","branch1","branch2"]']]], [$class: 'CascadeChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: '', filterLength: 1, filterable: false, name: 'second', randomName: 'choice-parameter-11407970350100', referencedParameters: 'first', script: [$class: 'GroovyScript', fallbackScript: [classpath: [], sandbox: false, script: ''], script: [classpath: [], sandbox: false, script: '''if(first.equals("master"))
{ 
   return["sub_branch1","sub_branch2"]
}''']]]])])([parameters([[$class: 'ChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: '', filterLength: 1, filterable: false, name: 'first', randomName: 'choice-parameter-11130887035000', script: [$class: 'GroovyScript', fallbackScript: [classpath: [], sandbox: false, script: ''], script: [classpath: [], sandbox: false, script: 'return["master","branch1","branch2"]']]]])])
node {
    def app

    stage('Clone repository') {
        /* Cloning the Repository to our Workspace */

        checkout scm
    }

    stage('Build image') {
        

        app = docker.build("aravindhsz/helloworld_using_pipeline")
    }

    

  
}
